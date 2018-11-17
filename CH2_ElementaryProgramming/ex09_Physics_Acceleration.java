package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Please find  the .PNG file from this package*/
public class ex09_Physics_Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        //Calculate acceleration
        double a = (v1 - v0) / t;

        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("The average acceletarion is " + df.format(a));
    }
}
