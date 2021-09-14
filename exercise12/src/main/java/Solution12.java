import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        int principal = input.nextInt();

        System.out.println("Enter the rate of interest: ");
        float rate = input.nextFloat();

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        float cRate = rate/100;

        double endInvest = principal * (1 + cRate * years);

        double endInvestDec = Math.ceil(endInvest*100)/100;

        System.out.printf("After %d years at %.2f%%, the investment will worth $%.2f", years, rate, endInvestDec);
    }
}
