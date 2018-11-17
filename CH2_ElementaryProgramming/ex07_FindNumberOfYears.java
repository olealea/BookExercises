package CH2_ElementaryProgramming;

import java.util.Scanner;

/**
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. Here is a sample run:
 *       Enter the number of minutes: 1000000000
 *       1000000000 minutes is approximately 1902 years and 214 days
 */
public class ex07_FindNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        int numberOfMinutes = input.nextInt();

        //Calculate the number of years
        int numberOfDays = numberOfMinutes / (24 * 60);
        int numberOfYears = numberOfDays / 365;
        int numberOfDaysRemained = numberOfDays % 365;

        System.out.println(numberOfMinutes + " minutes is approximately " + numberOfYears + " years and " +
                numberOfDaysRemained + " days");
    }
}
