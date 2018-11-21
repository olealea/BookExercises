package CH3_Selections;

import java.util.Scanner;

/**
 * See the PNG
 */
public class ex09_Business_CheckISBN10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        int digit4 = input.nextInt();
        int digit5 = input.nextInt();
        int digit6 = input.nextInt();
        int digit7 = input.nextInt();
        int digit8 = input.nextInt();
        int digit9 = input.nextInt();

        int digit10 = (digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9);
        System.out.println((digit10 == 10) ? "X" : digit10);
    }
}
