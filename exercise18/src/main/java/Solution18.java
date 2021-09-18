/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ask if Fahrenheit or Celsius needs to be converted.
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        char choice = in.next().toUpperCase().charAt(0);

        //Do the version base on the user needs.
        if (choice == 'C') {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temp = in.nextDouble();

            //Calculate
            double result = (temp - 32) / 1.8;

            System.out.println("The temperature in Celsius is " + result + ".");
        } else {
            System.out.print("Please enter the temperature in Celsius: ");
            double temp = in.nextDouble();

            //Calculate
            double result = (temp * 1.8) + 32;

            System.out.println("The temperature in Fahrenheit is " + result + ".");
        }
    }
}