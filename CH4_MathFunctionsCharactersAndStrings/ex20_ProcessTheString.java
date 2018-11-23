package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Process a string) Write a program that prompts the user to enter a string and displays
 * its length and its first character.
 */
public class ex20_ProcessTheString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine();

        System.out.printf("The length is %d and the first character is %c", string.length(), string.charAt(0));
    }
}
