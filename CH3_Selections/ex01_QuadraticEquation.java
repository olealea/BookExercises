package CH3_Selections;

import java.util.Scanner;

/**
 * See the PNG
 */
public class ex01_QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double r1 = (- b + Math.sqrt(discriminant)) / (2 * a);
        double r2 = (- b - Math.sqrt(discriminant)) / (2 * a);


        if (discriminant > 0){
            System.out.printf("The equation has 2 roots: %f and %.5f", r1, r2);
        } else if (discriminant == 0){
            System.out.printf("The equation has 1 root: %f", r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
