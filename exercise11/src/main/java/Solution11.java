import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        /*
        Print "How many euros are you exchanging?"
            Input = euro
        Print "What is the exchange rate?"
            Input = exRate
        dollars = euro * exRate
        Round the "dollars" to the 2 decimal place.
        Print "*euro* euros at an exchange rate of *exRate* is *roundOff* U.S. dollars."
         */
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        float euro = input.nextFloat();

        System.out.println("What is the exchange rate?");
        float exRate = input.nextFloat();

        float dollars = euro * exRate;

        float roundOff = (float) Math.ceil(dollars*100)/100;

        System.out.printf("%.2f euros at an exchange rate of %.2f is %.2f U.S. dollars.", euro, exRate, roundOff);
    }
}
