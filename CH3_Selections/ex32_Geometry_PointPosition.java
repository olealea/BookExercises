package CH3_Selections;

import java.util.Scanner;

/**
 * See the PNG
 */
public class ex32_Geometry_PointPosition {
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

        if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0) {
            System.out.println("p2 is on the left side line");
        } else if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) {
            System.out.println("p2 is on the same line");
        } else {
            System.out.println("p2 is on the right side line");
        }
    }
}
