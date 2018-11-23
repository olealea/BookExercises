package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character. Here is a sample run:
 *
 * Enter an ASCII code: 69
 * The character for ASCII code 69 is E
 */
public class ex08_FindCharacterFromASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        int code = input.nextInt();

        System.out.printf("The character for ASCII code %d is %c", code, (char)code);
    }
}
