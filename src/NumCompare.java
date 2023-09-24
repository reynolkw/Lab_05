import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber = 0.0;
        double secondNumber = 0.0;

        System.out.print("Enter the first number: ");
        if (input.hasNextDouble()) {
            firstNumber = input.nextDouble();
            input.nextLine();
        } else {
            System.out.println("ERROR: invalid value of '" + input.nextLine() + "'");
            System.exit(0);
        }

        System.out.print("Enter the second number: ");
        if (input.hasNextDouble()) {
            secondNumber = input.nextDouble();
            input.nextLine();
        } else {
            System.out.println("ERROR: invalid value of '" + input.nextLine() + "'");
            System.exit(0);
        }

        if (firstNumber > secondNumber)
            System.out.println(firstNumber + " is greater than " + secondNumber);
        else if (firstNumber < secondNumber)
            System.out.println(secondNumber + " is greater than " + firstNumber);
        else
            System.out.println(firstNumber + " is equal to " + secondNumber);
    }
}
