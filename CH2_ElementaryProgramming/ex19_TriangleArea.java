package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Please find  the .PNG file from this package*/
public class ex19_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Calculating the sides of triangle
        double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double side2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double side3 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

        double s = (side1 + side2 + side3) / 2;

        //Calculating the area of triangle
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("The area of the triangle is " + df.format(area));
    }
}
