import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (input.hasNextInt()) {
            int age = input.nextInt();
            if (age > 20)
                System.out.println("You get a wrist band. Enjoy the showing!");
        } else
            System.out.println("ERROR: invalid input of '" + input.nextLine() + "'");
    }
}
