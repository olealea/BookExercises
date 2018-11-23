package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Business: check ISBN-10) Rewrite the Programming Exercise  3.9 by entering the
 * ISBN number as a string.
 */
public class ex19_Business_CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as a string: ");
        String isbn = input.nextLine();

        int digit1 = Integer.parseInt(isbn.substring(0, 1));
        int digit2 = Integer.parseInt(isbn.substring(1, 2));
        int digit3 = Integer.parseInt(isbn.substring(2, 3));
        int digit4 = Integer.parseInt(isbn.substring(3, 4));
        int digit5 = Integer.parseInt(isbn.substring(4, 5));
        int digit6 = Integer.parseInt(isbn.substring(5, 6));
        int digit7 = Integer.parseInt(isbn.substring(6, 7));
        int digit8 = Integer.parseInt(isbn.substring(7, 8));
        int digit9 = Integer.parseInt(isbn.substring(8, 9));

        int digit10 = (digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 *
                5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + digit1 + digit2 + digit3 +
                digit4 + digit5 + digit6 + digit7 + digit8 + digit9);
        System.out.println((digit10 == 10) ? "X" : digit10);
    }
}
