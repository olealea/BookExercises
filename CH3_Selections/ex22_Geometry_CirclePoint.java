package CH3_Selections;

import java.util.Scanner;

/**
 * See the PNG
 */
public class ex22_Geometry_CirclePoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ((Math.pow(x * x + y * y, 0.5)) <= 10){
            System.out.printf("Point (%.1f, %.1f) is in the circle", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle", x, y);
        }
    }
}
