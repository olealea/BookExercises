package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** (Cost of driving) Write a program that prompts the user to enter the distance to
 drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 and displays the cost of the trip. Here is a sample run:
        Enter the driving distance: 900.5
        Enter miles per gallon: 25.5
        Enter price per gallon: 3.55
        The cost of driving is $125.36*/
public class ex23_CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double fuelEfficency = input.nextDouble();

        System.out.println("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        //Calculate the cost of driving
        double cost = distance / fuelEfficency * pricePerGallon;

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("The cost of driving is $" + df.format(cost));
    }
}
