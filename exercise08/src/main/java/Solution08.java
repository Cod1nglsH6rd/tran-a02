/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */
import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        /*
        Print "How many people?"
            Input = people
        Print "How many pizzas do you have?"
            Input = pizzas
        Print "How many slices per pizza
            Input = slicesPerPizza
        Calculate number of slices
            slices = slicesPerPizza * pizzas
            piecePerPerson = slices / people
            leftover = slices % people
        Print "*people* with "pizzas* (*slices* slices)
        Print "Each person gets *piecePerPerson* pieces of pizza."
        Print "There are *leftover* leftover pieces."
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int people = input.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();

        System.out.println("How many slices per pizza?");
        int slicesPerPizza = input.nextInt();

        int slices = slicesPerPizza * pizzas;
        int piecesPerPerson = slices/people;
        int leftover = slices % people;
        System.out.println(people + " with " + pizzas + " (" + slices + " slices)");
        System.out.println("Each person gets " + piecesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");


    }
}
