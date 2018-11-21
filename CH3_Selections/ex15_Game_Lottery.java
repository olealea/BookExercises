package CH3_Selections;

import java.util.Scanner;

/**
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three digit
 * number. The program prompts the user to enter a three-digit number and
 * determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award is
 * $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is
 * $1,000.
 */
public class ex15_Game_Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit number");
        int number = input.nextInt();
        int thirdDigit = number % 10;
        int secondDigit = number / 10 % 10;
        int firstDigit = number / 100 % 10;

        int generatedNumber = (int) (Math.random() * 1000);

        int thirdGeneratedDigit = generatedNumber % 10;
        int secondGeneratedDigit = generatedNumber / 10 % 10;
        int firstGeneratedDigit = generatedNumber / 100 % 10;

        System.out.println("Your number: " + firstDigit + secondDigit + thirdDigit);
        System.out.println("Result number: " + firstGeneratedDigit + secondGeneratedDigit + thirdGeneratedDigit);

        if (number == generatedNumber) {
            System.out.println("The award is $10.000");
        } else if (("" + generatedNumber).contains("" + firstDigit) && ("" + generatedNumber).contains("" + secondDigit)
                && ("" + generatedNumber).contains("" + thirdDigit)) {
            System.out.println("The award is $3.000");
        } else if (("" + generatedNumber).contains("" + firstDigit) || ("" + generatedNumber).contains("" + secondDigit)
                || ("" + generatedNumber).contains("" + thirdDigit)) {
            System.out.println("The award is $1.000");
        } else {
            System.out.println("Try one more time!");
        }
    }
}

