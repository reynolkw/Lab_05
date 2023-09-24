import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month [1-12]: ");

        if (input.hasNextInt()) {

            int inputInt = input.nextInt();
            input.nextLine();

            if (inputInt > 0 && inputInt < 13)
                System.out.println("Your birth month is: " + inputInt);
            else
                System.out.println("ERROR: input value (" + inputInt + ") out of range.");

        } else
            System.out.println("ERROR: invalid type of '" + input.nextLine() + "'");
    }
}
