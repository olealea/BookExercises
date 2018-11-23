package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number. Here are some sample runs:
 *
 * Enter a decimal value (0 to 15): 11
 * The hex value is B
 * Enter a decimal value (0 to 15): 5
 * The hex value is 5
 * Enter a decimal value (0 to 15): 31
 * 31 is an invalid input
 */
public class ex11_DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if ((decimal < 16) && (decimal >= 0)) {
            System.out.printf("The hex value is %s", Integer.toHexString(decimal));
        } else {
            System.out.printf("%d is an invalid input", decimal);
        }
    }
}
