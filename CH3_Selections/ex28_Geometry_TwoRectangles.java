package CH3_Selections;

import java.util.Scanner;

/**
 * Please see the PNG.
 * Here are the sample runs:
 * <p>
 * Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
 * Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
 * r2 is inside r1
 * <p>
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
 * Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
 * r2 overlaps r1
 * <p>
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
 * Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
 * r2 does not overlap r1
 */
public class ex28_Geometry_TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, w1, h1, x2, y2, w2, h2;

        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        w1 = input.nextDouble();
        h1 = input.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        w2 = input.nextDouble();
        h2 = input.nextDouble();

        if ((Math.sqrt(Math.pow(y1 - y1, 2)) + h2 / 2 <= h1 / 2) &&
                (Math.sqrt(Math.pow(x2 - x1, 2)) + w2 / 2 <= w1 / 2) &&
                (h1 / 2 + h2 / 2 <= h1) && (h1 / 2 + h2 / 2 <= h1)) {
            System.out.println("r2 is inside r1");
        }
        else if ((x1 + w1 / 2 > x2 - w2) || (y1 + h1 / 2 > y2 - h2)) {
            System.out.println("r2 overlaps r1");
        }
        else
            System.out.println("r2 does not overlap r1");
    }
}
