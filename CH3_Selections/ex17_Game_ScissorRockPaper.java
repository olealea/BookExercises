package CH3_Selections;

import java.util.Scanner;

/**
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper
 * game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,
 * or draws. Here are sample runs:
 * scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rock. You won
 * <p>
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw
 */
public class ex17_Game_ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 0, 1, or 2 for scissor, rock or paper: ");
        int userNumber = input.nextInt();

        int computerNumber = (int) (Math.random() * 2 + 1);

        if (userNumber == 0) {
            if (computerNumber == 0) {
                System.out.println("The computer is scissor. You are scissor too. It is a draw");
            } else if (computerNumber == 1) {
                System.out.println("The computer is rock. You are scissor. You lost");
            } else if (computerNumber == 2) {
                System.out.println("The computer is paper. You are scissor. You won");
            }
        } else if (userNumber == 1) {
            if (computerNumber == 0) {
                System.out.println("The computer is scissor. You are rock. You won");
            } else if (computerNumber == 1) {
                System.out.println("The computer is rock. You are rock too. It is a draw");
            } else if (computerNumber == 2) {
                System.out.println("The computer is paper. You are rock. You lost");
            }
        } else if (userNumber == 2) {
            if (computerNumber == 0) {
                System.out.println("The computer is scissor. You are paper. You lost");
            } else if (computerNumber == 1) {
                System.out.println("The computer is rock. You are paper. You won");
            } else if (computerNumber == 2) {
                System.out.println("The computer is paper. You are paper. It is a draw");
            }
        }
    }
}
