package CH2_ElementaryProgramming;

import java.util.Scanner;

/** (Sum the digits in an integer) Write a program that reads an integer between 0 and
 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 sum of all its digits is 14.
 Hint: Use the % operator to extract digits, and use the / operator to remove the
 extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 Here is a sample run:
        Enter a number between 0 and 1000: 999
        The sum of the digits is 27 */
public class ex06_SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:");
        int number = input.nextInt();

        //Calculate the sum of the digits
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits = sumOfDigits + number % 10;
            number = number / 10;
        }
        System.out.println("The sum of the digits is " + sumOfDigits);
    }
}
