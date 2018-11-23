package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * <p>
 * See the PNG for formula
 * <p>
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area. Here is a sample run:
 * <p>
 * Enter the side: 5.5
 * The area of the hexagon is 78.59
 */
public class ex04_Geometry_AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        System.out.printf("The area of the hexagon is %.2f",
                6 * side * side / (4 * Math.tan(Math.PI / 6)));
    }
}
