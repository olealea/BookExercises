package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 health on weight. It can be calculated by taking your weight in kilograms and
 dividing by the square of your height in meters. Write a program that prompts the
 user to enter a weight in pounds and height in inches and displays the BMI. Note
 that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
 a sample run:
        Enter weight in pounds: 95.5
        Enter height in inches: 50
        BMI is 26.8573 */
public class ex14_HealthApp_ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        //Convert weight in kilograms and height in meters
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        //Calculate the BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("BMI is " + df.format(bmi));
    }
}
