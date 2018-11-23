package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * See the PNG
 */
public class ex01_Geometry_AreaOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double side = 2 * length * Math.sin(Math.PI / 5);
        double area = 5 * side * side / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
