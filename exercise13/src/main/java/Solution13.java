/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        /*
        Ask for the principal
            Input = principal
        Ask for the rate of interest
            Input = rate
        Ask for the years
            Input = years
        Ask for the number of times the interest is compounded per year
            Input = yearTime
        Calculate the End of year investment
        Print
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        int principal = input.nextInt();

        System.out.println("Enter the rate of interest (percentage): ");
        float rate = input.nextFloat();

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        System.out.println("Enter the number of times the interest is compounded per year: ");
        int yearTime = input.nextInt();

        float cRate = rate/100;

        double endInvest = principal * (Math.pow((1 + cRate / yearTime), (yearTime*years)));

        double endInvestDec = Math.ceil(endInvest*100)/100;

        System.out.printf("$%d invested at %.2f%% for %d years compound %d times per year is $%.2f.", principal, rate, years, yearTime, endInvestDec);
    }
}
