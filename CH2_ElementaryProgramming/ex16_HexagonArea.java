package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Please find  the .PNG file from this package
 errata:  in the output box for Programming Exercise 2.16, change 78.5895 to 78.5918. */
public class ex16_HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        //Calculate the area of hexagon:
        double area = 3 * Math.sqrt(3) * Math.pow(side,2) / 2.0;

        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("The area of the hexagon is " + df.format(area));
    }
}
