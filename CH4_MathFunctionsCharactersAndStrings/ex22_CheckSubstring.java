package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Check substring) Write a program that prompts the user to enter two strings and
 * reports whether the second string is a substring of the first string
 * <p>
 * Enter string s1: ABCD
 * Enter string s2: BC
 * BC is a substring of ABCD
 * <p>
 * Enter string s1: ABCD
 * Enter string s2: BDC
 * BDC is not a substring of ABCD
 */
public class ex22_CheckSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.println("Enter string s2");
        String s2 = input.nextLine();

        System.out.printf(s1.contains(s2) ? "%s is a substring of %s" :
                "%s is not a substring of %s", s2, s1, s2, s1);

    }
}
