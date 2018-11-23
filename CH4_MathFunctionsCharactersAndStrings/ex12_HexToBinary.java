package CH4_MathFunctionsCharactersAndStrings;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import java.util.Scanner;

/**
 * (Hex to binary) Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number. Here is a sample run:
 *
 * Enter a hex digit: B
 * The binary value is 1011
 * Enter a hex digit: G
 * G is an invalid input
 */
public class ex12_HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex digit: ");
        String hexadecimal = input.nextLine();
        char ch = hexadecimal.charAt(0);

        if ((ch < 'G') && (ch > '0')) {
            int decimal = Integer.parseInt(hexadecimal, 16);
            System.out.printf("The binary value is %s", Integer.toBinaryString(decimal));
        } else {
            System.out.printf("%s is an invalid input", hexadecimal);
        }
    }
}
