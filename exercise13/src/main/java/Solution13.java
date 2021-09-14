import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        int principal = input.nextInt();

        System.out.println("Enter the rate of interest: ");
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
