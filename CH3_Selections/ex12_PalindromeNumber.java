package CH3_Selections;

import java.util.Scanner;

/**
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 integer and determines whether it is a palindrome number. A number is palindrome
 if it reads the same from right to left and from left to right. Here is a sample
 run of this program:
    Enter a three-digit integer: 121
    121 is a palindrome

    Enter a three-digit integer: 123
    123 is not a palindrome
 */
public class ex12_PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();

        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            System.out.printf("%d is a palindrome", number);
        } else {
            System.out.printf("%d is not a palindrome", number);
        }
    }
}
