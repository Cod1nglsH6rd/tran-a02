import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        /*
        Print "What is the length of the room in feet?"
            Input = length
        Print "What is the width of the room in feet?"
            Input = width
        Print "You entered dimensions of *length* feet by *width* feet."

        area = length * width

        meters = area * 0.09290304

        Print"The area is"
            Print "*area* square feet"
            Print "*meters* square meters"
        */

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");

        int area = length * width;

        double meters = area * 0.09290304;

        System.out.println(area + " square feet");

        System.out.printf("%.3f square feet", meters);
    }
}