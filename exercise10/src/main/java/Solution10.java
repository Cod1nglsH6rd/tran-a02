/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args){
        /*
        Add every item when asked
        Add number of items
            Enter the price of item
            Enter the quantity of item 1
            Enter the price of item 2
            Enter the quantity of item 2
            Enter the price of item 3
            Enter the quantity of item 3
        Calculate tax
        Calculate total
        Print Subtotal, Tax, Number of items.
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
