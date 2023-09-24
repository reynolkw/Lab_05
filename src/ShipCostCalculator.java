import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {

        final double SHIPPING_PERCENT = 0.02;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item price: $");

        if (input.hasNextDouble()) {

            double itemPrice = input.nextDouble();
            input.nextLine();

            double shippingCost = 0.0;
            if (itemPrice < 100.0) {
                shippingCost = itemPrice * SHIPPING_PERCENT;
            }

            double total = itemPrice + shippingCost;
            System.out.println("The shipping cost is $" + shippingCost + ".");
            System.out.println("The total cost is $" + total + ".");

        } else
            System.out.println("ERROR: Unsupported input of '" + input.nextLine() + "'");
    }
}