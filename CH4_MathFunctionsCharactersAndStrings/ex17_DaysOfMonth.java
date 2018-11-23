package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Days of a month) Write a program that prompts the user to enter a year and the
 * first three letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month. Here is a sample run:
 * <p>
 * Enter a year: 2001
 * Enter a month: Jan
 * Jan 2001 has 31 days
 * <p>
 * Enter a year: 2016
 * Enter a month: Feb
 * Jan 2016 has 29 days
 */
public class ex17_DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month: ");
        String month = input.next();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case "Jan":
                System.out.printf("%s %d had 31 days", month, year);
                break;
            case "Feb":
                System.out.printf("%s %d had ", month, year);
                System.out.println(isLeap ? "29 days" : "28 days");
                break;
            case "Mar":
                System.out.printf("%s %d had 31 days", month, year);
                break;
            case "Apr":
                System.out.printf("%s %d had 30 days", month, year);
                break;
            case "May":
                System.out.printf("%s %d had 31 days", month, year);
                break;
            case "Jun":
                System.out.printf("%s %d had 30 days", month, year);
                break;
            case "Jul":
                System.out.printf("%s %d had 31 days", month, year);
                break;
            case "Aug":
                System.out.printf("%s %d had 31 days", month, year);
                break;
            case "Sep":
                System.out.printf("%s %d had 30 days", month, year);
                break;
            case "Oct":
                System.out.printf("%s %d had 31 days", month, year);
                break;
            case "Nov":
                System.out.printf("%s %d had 30 days", month, year);
                break;
            case "Dec":
                System.out.printf("%s %d had 31 days", month, year);
        }
    }
}
