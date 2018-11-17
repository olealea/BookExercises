package CH2_ElementaryProgramming;

import java.util.Scanner;

/** (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 The program prompts the user to enter a number in pounds, converts it
 to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
 sample run:
 Enter a number in pounds: 55.5
 55.5 pounds is 25.197 kilograms */
public class ex04_ConvertPoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double numberInPounds = input.nextDouble();

        //Convert pounds into kilograms
        double numberInKilograms = numberInPounds * 0.454;

        System.out.println(numberInPounds + " pounds is " + numberInKilograms + " kilograms");
    }
}
