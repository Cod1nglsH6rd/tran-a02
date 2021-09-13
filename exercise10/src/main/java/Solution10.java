import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args){
        /*
        Enter the price of item 1: 25
        Enter the quantity of item 1: 2
        Enter the price of item 2: 10
        Enter the quantity of item 2: 1
        Enter the price of item 3: 4
        Enter the quantity of item 3: 1
        Subtotal: $64.00
        Tax: $3.52
        Total: $67.52
         */
        Scanner input = new Scanner(System.in);

        float price = 0.00f;
        float priceInput;
        int quantity = 0;
        int quantityInput;


        for(int item = 1; item <= 4; item++){
            System.out.printf("Enter the price of item %d: ", item);
            priceInput = input.nextInt();
            price += priceInput;

            System.out.printf("Enter the quantity of item %d: ", item);
            quantityInput = input.nextInt();
            quantity += quantityInput;
        }

        double tax = price * .055;

        double total = tax + price;

        System.out.printf("Subtotal: $%.2f\n", price);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
        System.out.printf("Number of items: %d\n", quantity);
        System.out.printf("Your total will be $%.2f for %d item(s).", total, quantity);
    }
}
