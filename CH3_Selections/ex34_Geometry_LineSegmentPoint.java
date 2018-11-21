package CH3_Selections;

import java.util.Scanner;

/**
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test
 * whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
 * test whether a point is on a line segment. Write a program that prompts the user
 * to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
 * segment from p0 to p1. Here are some sample runs:
 * <p>
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 * <p>
 * Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
 * (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 */
public class ex34_Geometry_LineSegmentPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2;

        System.out.println("Enter three points for p0, p1, and p2: ");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        if (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) && (x2 > x0 && x2 < x1) && (y2 > y0 && y2 < y1)) {
            System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        } else {
            System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
    }
}
