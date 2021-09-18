/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Ask whether if the user is male or female
        System.out.println("Enter a 1 if you are male or 2 if you are female:");
        int sex = input.nextInt();

        //Ask how many ounces they drank
        System.out.println("How many ounces of alcohol did you have?");
        int drink = input.nextInt();

        //Ask for the weight
        System.out.println("What is your weight, in pounds?");
        int weight = input.nextInt();

        //Ask how many hours since their last drink
        System.out.println("How many hours has it been since your last drink?");
        int hours = input.nextInt();

        double ratio = 0;

        //Assign "ratio" depending on sex
        if (sex == 1) {
            ratio = 0.73;
        } else {
            ratio = 0.66;
        }

        //Calculate the user BAC
        double bac = (drink * 5.14 / weight * ratio) - 0.015 * hours;

        System.out.printf("Your BAC is %.6f\n", bac);

        //Print base on BAC
        if (bac <= 0.08) {
            System.out.println("It is legal for you to drive.");
        } else {
            System.out.println("It is not legal for you to drive.");
        }


    }
}
