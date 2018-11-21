package CH3_Selections;

import java.util.Scanner;

/**
 * See the PNG
 */
public class ex21_Science_DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter day");
        int day = input.nextInt();

        int k = year % 7; // The year of the century
        int j = (int)(year / 100.0); // the century
        int q = day - 1;
        int m = month;
        int h = (int)((q + ((26 * (m + 1)) / 10.0) + k + (k / 4.0)
                + (j / 4.0) + (5 * j)) % 7);

        String result = "Day of the week is ";

        //Display the name of the day of the week
        if (h == 0)
            System.out.print(result + "Saturday");
        else if (h == 1)
            System.out.print(result + "Sunday");
        else if (h == 2)
            System.out.print(result + "Monday");
        else if (h == 3)
            System.out.print(result + "Tuesday");
        else if (h == 4)
            System.out.print(result + "Wednesday");
        else if (h == 5)
            System.out.print(result + "Thursday");
        else
            System.out.print(result + "Friday");
    }

    }

