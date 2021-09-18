/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {

        /*
        Ask for an order amount
            Input = cost
        Ask for the State
            Input = State
        If (State = WI)
            Add tax to it
            Print subtotal and tax
        Calculate the total cost
        Print out the total
         */

        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double cost = input.nextInt();

        System.out.println("What is the state?");

        input.nextLine(); //Consume nextline
        String state = input.nextLine();
        
        double tax = 0;

        if(state.equals("WI")) {
            tax = (Math.ceil((cost * .055 * 100))/100);
            System.out.printf("The subtotal is $%.2f.\n", cost);
            System.out.printf("The tax is $%.2f.\n", tax);
        }
        double total = tax + cost;
        System.out.printf("The total is $%.2f.", total);
    }
}
