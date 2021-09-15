import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double cost = input.nextInt();

        System.out.println("What is the state?");

        input.nextLine(); //Consume nexline
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
