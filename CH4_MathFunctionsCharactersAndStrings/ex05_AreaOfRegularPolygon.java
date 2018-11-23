package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
 * which all sides are of the same length and all angles have the same degree (i.e., the
 * polygon is both equilateral and equiangular). The formula for computing the area
 * of a regular polygon is
 * <p>
 * See the PNG for formula
 * <p>
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. Here is
 * a sample run:
 * <p>
 * Enter the number of sides: 5
 * Enter the side: 6.5
 * The area of the polygon is 74.69017017488385
 */
public class ex05_AreaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        System.out.printf("The area of polygon is %f",
                numberOfSides * side * side / (4 * Math.tan(Math.PI / numberOfSides)));
    }
}
