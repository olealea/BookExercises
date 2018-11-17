package CH2_ElementaryProgramming;

import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

/** (Compute the volume of a cylinder) Write a program that reads in the radius
 and length of a cylinder and computes the area and volume using the following
 formulas:
    area = radius * radius * p
    volume = area * length
 Here is a sample run:
     Enter the radius and length of a cylinder: 5.5 12
     The area is 95.0331
     The volume is 1140.4 */
public class ex02_ComputeVolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // Convert Celsius to Farenheit
        double area = radius * radius * Math.PI;
        double volume = area * length;

        //Decimal places for output data as provided in Example
        DecimalFormat df_area = new DecimalFormat("#.####");
        DecimalFormat df_volume = new DecimalFormat("#.#");

        df_area.setRoundingMode(RoundingMode.DOWN);

        System.out.println("The area is " + df_area.format(area));
        System.out.println("The volume is " + df_volume.format(volume));
    }
}
