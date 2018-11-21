package CH3_Selections;

import java.util.Scanner;

/**
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 a triangle and computes the perimeter if the input is valid. Otherwise, display that
 the input is invalid. The input is valid if the sum of every pair of two edges is
 greater than the remaining edge.
 */
public class ex19_PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("Perimeter is " + (side1 + side2 + side3));
        } else {
            System.out.println("Input is not valid");
        }

    }
}
