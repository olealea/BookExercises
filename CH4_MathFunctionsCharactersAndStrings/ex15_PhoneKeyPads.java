package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Phone key pads) The international standard letter/number mapping found on the
 * telephone is shown below:
 * <p>
 * See the PNG
 * <p>
 * Write a program that prompts the user to enter a letter and displays its corresponding
 * number.
 * Enter a letter: A
 * The corresponding number is 2
 * Enter a letter: a
 * The corresponding number is 2
 * Enter a letter: +
 * + is an invalid input
 */
public class ex15_PhoneKeyPads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        if ((letter.equalsIgnoreCase("a")) ||
                (letter.equalsIgnoreCase("b")) ||
                (letter.equalsIgnoreCase("c"))) {

            System.out.println("The corresponding number is 2");
        } else if ((letter.equalsIgnoreCase("d")) ||
                (letter.equalsIgnoreCase("e")) ||
                (letter.equalsIgnoreCase("f"))) {

            System.out.println("The corresponding number is 3");
        } else if ((letter.equalsIgnoreCase("g")) ||
                (letter.equalsIgnoreCase("h")) ||
                (letter.equalsIgnoreCase("i"))) {

            System.out.println("The corresponding number is 4");
        } else if ((letter.equalsIgnoreCase("j")) ||
                (letter.equalsIgnoreCase("k")) ||
                (letter.equalsIgnoreCase("l"))) {

            System.out.println("The corresponding number is 5");
        } else if ((letter.equalsIgnoreCase("m")) ||
                (letter.equalsIgnoreCase("n")) ||
                (letter.equalsIgnoreCase("o"))) {

            System.out.println("The corresponding number is 6");
        } else if ((letter.equalsIgnoreCase("p")) ||
                (letter.equalsIgnoreCase("q")) ||
                (letter.equalsIgnoreCase("r")) ||
                (letter.equalsIgnoreCase("s"))) {

            System.out.println("The corresponding number is 7");
        } else if ((letter.equalsIgnoreCase("t")) ||
                (letter.equalsIgnoreCase("u")) ||
                (letter.equalsIgnoreCase("v"))) {

            System.out.println("The corresponding number is 8");
        } else if ((letter.equalsIgnoreCase("w")) ||
                (letter.equalsIgnoreCase("x")) ||
                (letter.equalsIgnoreCase("y")) ||
                (letter.equalsIgnoreCase("z"))) {

            System.out.println("The corresponding number is 9");
        } else {
            System.out.printf("%s is invalid input", letter);
        }
    }
}
