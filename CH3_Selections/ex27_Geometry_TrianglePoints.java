package CH3_Selections;

import java.util.Scanner;

/**
 * See the PNG
 * Output:
 * Enter a point's x- and y-coordinates: 100.5 25.5
 * The point is in the triangle
 * Enter a point's x- and y-coordinates: 100.5 50.5
 * The point is not in the triangle
 */
public class ex27_Geometry_TrianglePoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point's x- and y- coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println(x > 0 && y > 0 && x + 2 * y < 200 ? "Point is in triangle!" :
                "Point is not in the triangle!");
    }
}
