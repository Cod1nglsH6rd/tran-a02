import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {

        String realPassword = "abc$123";

        Scanner input = new Scanner(System.in);
        System.out.println("What is the password?");
        String password = input.nextLine();

        if (realPassword.equals(password)){
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }

    }
}
