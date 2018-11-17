package CH2_ElementaryProgramming;

import java.util.Scanner;

/** (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 the current time in GMT. Revise the program so that it prompts the user to enter
 the time zone offset to GMT and displays the time in the specified time zone. Here
 is a sample run:
        Enter the time zone offset to GMT: -5
        The current time is 4:50:34 */
public class ex08_CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24 + offset;

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);
    }
}
