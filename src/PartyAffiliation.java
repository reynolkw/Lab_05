import java.util.Locale;
import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your party affiliation (Democrat, Republican, or Independent)\n[DRI]: ");

        String response = input.nextLine().toUpperCase(Locale.ROOT);
        if (response.equals("D"))
            System.out.println("You get a Democratic Donkey.");
        else if (response.equals("R"))
            System.out.println("You get a Republican Elephant.");
        else if (response.equals("I"))
            System.out.println("You get an Independent Person.");
        else
            System.out.println("ERROR: affiliation not in database\n\nYou should get something...");
    }
}
