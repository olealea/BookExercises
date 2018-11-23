package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid. Here are sample runs:
 * <p>
 * Enter a SSN: 232-23-5435
 * 232-23-5435 is a valid social security number
 * Enter a SSN: 23-23-5435
 * 23-23-5435 is an invalid social security number
 */
public class ex21_CheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN: ");
        String number = input.nextLine();

        System.out.printf(number.matches("\\d{3}-\\d{2}-\\d{4}") ?
                        "%s is a valid social security number" :
                        "%s is an invalid social security number", number, number);
    }
}
