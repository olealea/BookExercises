package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. Here is a sample run:
 *
 * Enter a letter: B
 * B is a consonant
 * Enter a letter: a
 * a is a vowel
 * Enter a letter: #
 * # is an invalid input
 */
public class ex13_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        if ((letter.equalsIgnoreCase("a")) ||
                (letter.equalsIgnoreCase("o")) ||
                (letter.equalsIgnoreCase("e")) ||
                (letter.equalsIgnoreCase("i")) ||
                (letter.equalsIgnoreCase("u"))) {

            System.out.printf("%s is a vowel", letter);
        }
        else if ((letter.charAt(0) >= 'a') && (letter.charAt(0) <= 'z') ||
                (letter.charAt(0) >= 'A') && (letter.charAt(0) <= 'Z')){

            System.out.printf("%s is a consonant", letter);
        }
        else {
            System.out.printf("%s is an invalid input", letter);
        }
    }
}
