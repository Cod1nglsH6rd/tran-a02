/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Ask for the age
        System.out.println("What is your age?");
        int age = input.nextInt();

        //Print depending on age
        String result = (age>=16)?"You are old enough to legally drive.":"You are not old enough to legally drive.";
        System.out.println(result);
    }
}
