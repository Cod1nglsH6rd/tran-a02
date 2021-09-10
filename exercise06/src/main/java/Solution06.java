import java.util.Date;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
public class Solution06 {
    public static void main(String[] args) {
    /* Print "What is your current age"
            Input = age
       Print "What age do you want to retire?"
            Input = retireGoal
       retireAge = retireGoal - age
       get the current year = currentYear
       year = currentYear + retireAge
       Print "It's *currentYear*, so you can retire in *year*"
     */
        System.out.println("What is your current age?");
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());

        System.out.println("What age do you want to retire?");
        int retireGoal = Integer.parseInt(input.nextLine());

        int retireAge = retireGoal - age;

        Date date = new Date();

        int currentYear = date.getYear() + 1900;

        int year = currentYear + retireAge;

        System.out.println("It's " + currentYear + " , so you can retire in " + year);

    }
}
