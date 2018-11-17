package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Please find  the .PNG file from this package*/
public class ex17_Science_WindTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Farenheit between -58*F and 41*F: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        int speed = input.nextInt();

        //Calculate the Wind-Chill temperature
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
                + 0.4275 * temperature * Math.pow(speed, 0.16);

        DecimalFormat df = new DecimalFormat("###.#####");
        System.out.println("The wind chill index is " + df.format(windChill));
    }
}
