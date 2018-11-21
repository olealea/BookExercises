package CH3_Selections;

import java.util.Scanner;

/**
 * (Find the number of days in a month) Write a program that prompts the user
 to enter the month and year and displays the number of days in the month. For
 example, if the user entered month 2 and year 2012, the program should display
 that February 2012 had 29 days. If the user entered month 3 and year 2015, the
 program should display that March 2015 had 31 days.
 */
public class ex11_NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month){
            case 1:
                System.out.printf("January %d had 31 days", year);
                break;
            case 2:
                System.out.printf("February %d had ", year);
                System.out.println(isLeap ? "29 days" : "28 days");
                break;
            case 3:
                System.out.printf("March %d had 31 days", year);
                break;
            case 4:
                System.out.printf("April %d had 30 days", year);
                break;
            case 5:
                System.out.printf("May %d had 31 days", year);
                break;
            case 6:
                System.out.printf("June %d had 30 days", year);
                break;
            case 7:
                System.out.printf("July %d had 31 days", year);
                break;
            case 8:
                System.out.printf("August %d had 31 days", year);
                break;
            case 9:
                System.out.printf("September %d had 30 days", year);
                break;
            case 10:
                System.out.printf("October %d had 31 days", year);
                break;
            case 11:
                System.out.printf("November %d had 30 days", year);
                break;
            case 12:
                System.out.printf("December %d had 31 days", year);
        }
    }
}
