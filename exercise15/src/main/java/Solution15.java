/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {

        //Assign the password to "abc$123"
        String realPassword = "abc$123";

        //Ask for the password
        Scanner input = new Scanner(System.in);
        System.out.println("What is the password?");
        String password = input.nextLine();

        //Verify the password the user gave
        if (realPassword.equals(password)){
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }

    }
}
