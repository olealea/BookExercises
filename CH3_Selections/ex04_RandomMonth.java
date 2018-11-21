package CH3_Selections;

import java.util.Scanner;

/**
 * (Random month) Write a program that randomly generates an integer between 1
 and 12 and displays the English month name January, February, …, December for
 the number 1, 2, …, 12, accordingly.
 */
public class ex04_RandomMonth {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 13 + 1);

        switch (number){
            case 1:
                System.out.println("January for " + number); break;
            case 2:
                System.out.println("February for " + number); break;
            case 3:
                System.out.println("March for " + number); break;
            case 4:
                System.out.println("April for " + number); break;
            case 5:
                System.out.println("May for " + number); break;
            case 6:
                System.out.println("June for " + number); break;
            case 7:
                System.out.println("July for " + number); break;
            case 8:
                System.out.println("August for " + number); break;
            case 9:
                System.out.println("September for " + number); break;
            case 10:
                System.out.println("October for " + number); break;
            case 11:
                System.out.println("November for " + number); break;
            case 12:
                System.out.println("December for " + number);
        }
    }
}
