package CH3_Selections;

import java.util.Scanner;

/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of
 a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 which represents head or tail. The program prompts the user to enter a guess and
 reports whether the guess is correct or incorrect.
 */
public class ex14_Game_HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Guess the flip - enter 0 (head) or 1 (tail):");
        int flip = input.nextInt();

        System.out.println(flip == 0 ? "You chose 0 (head)" : "You chose 1 (tail)");

        if (Math.random() < 0.5) {
            System.out.println("Result is 0 (head)");
            System.out.println(flip == 0 ? "The guess is correct!" : "The guess is incorrect!!");
            }
            else {
            System.out.println("Result is 1 (tail)");
            System.out.println(flip == 1 ? "The guess is correct!!" : "The guess is incorrect!!");
        }
    }
}
