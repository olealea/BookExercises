package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon. Here is a sample run:
 * Enter the radius of the bounding circle: 100
 * The coordinates of five points on the pentagon are
 * (95.1057, 30.9017)
 * (0.000132679, 100)
 * (-95.1056, 30.9019)
 * (-58.7788, -80.9015)
 * (58.7782, -80.902)
 *
 * (x,y)=(8.1cos(t+k2π/5),8.1sin(t+k2π/5))
 */
public class ex07_CornerPointCoordinates {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        x1 = radius * Math.cos(2 * 1 * Math.PI / 5);
        y1 = radius * Math.sin(2 * 1 * Math.PI / 5);
        x2 = radius * Math.cos(2 * 2 * Math.PI / 5);
        y2 = radius * Math.sin(2 * 2 * Math.PI / 5);
        x3 = radius * Math.cos(2 * 3 * Math.PI / 5);
        y3 = radius * Math.sin(2 * 3 * Math.PI / 5);
        x4 = radius * Math.cos(2 * 4 * Math.PI / 5);
        y4 = radius * Math.sin(2 * 4 * Math.PI / 5);
        x5 = radius * Math.cos(2 * 5 * Math.PI / 5);
        y5 = radius * Math.sin(2 * 5 * Math.PI / 5);

        System.out.printf("The coordinates of five points on the pentagon are\n " +
                "(%f, %f)\n(%f, %f)\n(%f, %f)\n(%f, %f)\n(%f, %f)",
                x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);
    }
}
