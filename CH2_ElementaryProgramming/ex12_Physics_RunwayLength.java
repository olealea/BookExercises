package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Please find  the .PNG file from this package*/
public class ex12_Physics_RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        //Compute the minimal runway length needed for the airplane to take off
        double length = speed * speed / (2 * acceleration);

        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("The minimum runway length for this airplane is " + df.format(length));
    }
}
