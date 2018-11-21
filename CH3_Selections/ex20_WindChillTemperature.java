package CH3_Selections;

import java.util.Scanner;

/**
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
 to compute the wind-chill temperature. The formula is valid for temperatures in
 the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
 Write a program that prompts the user to enter a temperature and a wind speed.
 The program displays the wind-chill temperature if the input is valid; otherwise,
 it displays a message indicating whether the temperature and/or wind speed is
 invalid.
 */
public class ex20_WindChillTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Farenheit between -58*F and 41*F: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        int speed = input.nextInt();

        //Calculate the Wind-Chill temperature
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
                + 0.4275 * temperature * Math.pow(speed, 0.16);

        if ((speed >= 2) && (temperature > -58) && (temperature < 41)) {
            System.out.printf("The wind chill index is %.5f", windChill);
        } else if ((temperature <= -58) || (temperature >= 41)) {
            System.out.println("Temperature is not valid!");
        } else {
            System.out.println("Speed is not valid!");
        }
    }
}
