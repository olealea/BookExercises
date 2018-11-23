package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode. Here is a sample run:
 * <p>
 * Enter a character: E
 * The Unicode for the character E is 69
 */
public class ex09_FindUnicodeOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        System.out.printf("The Unicode for the character %c is %d", ch, (int)ch);
    }
}
