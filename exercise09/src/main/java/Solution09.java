import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        /*
        Ask how big is the room
            Print "What is the length of the room in feet?"
                Input = length
            Print "what is the width of the room in feet?"
                Input = width
        area = width * length
        numGallons = Math.ceil(area / 350.0)
        Print "You will need to purchase *numGallons* gallons of paint to cover *area* square feet."
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();

        int area = length * width;

        int numGallons = (int) Math.ceil(area / 350.0);

        System.out.println("You will need to purchase " + numGallons + " gallons of paint to cover " + area + " square feet.");

    }
}
