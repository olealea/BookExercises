package CH3_Selections;

import java.util.Scanner;

/**
 * See the PNG
 */
public class ex29_Geometry_TwoCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, r1, x2, y2, r2;

        System.out.println("Enter c1's center x-, y-coordinates, and radius: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        r1 = input.nextDouble();

        System.out.println("Enter c2's center x-, y-coordinates, and radius: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        r2 = input.nextDouble();

        if (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) <= Math.abs(r1 - r2)) {
            System.out.println("c2 is inside c1");
        } else if ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) <= r1 + r2) {
            System.out.println("c2 overlaps c1");
        } else {
            System.out.println("c2 does not overlap c1");
        }
    }
}
