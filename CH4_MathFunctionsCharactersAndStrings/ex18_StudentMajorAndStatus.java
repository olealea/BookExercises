package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following characters are used to denote the majors:
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 * Here is a sample run:
 * <p>
 * Enter two characters: M1
 * Mathematics Freshman
 * Enter two characters: C3
 * Computer Science Junior
 * Enter two characters: T3
 * Invalid input
 */
public class ex18_StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters: ");
        String s = input.nextLine();
        char major = s.charAt(0);
        char status = s.charAt(1);

        if (major != 'M' && major != 'C' && major != 'I' ||
                status != '1' && status != '2' && status != '3' && status != '4') {

            System.out.println("Invalid input");
        } else {

            switch (major) {
                case 'M':
                    System.out.print("Mathematics ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'I':
                    System.out.print("Information Technology ");
            }

            switch (status) {
                case '1':
                    System.out.println("Freshman");
                    break;
                case '2':
                    System.out.println("Sophomore");
                    break;
                case '3':
                    System.out.println("Junior");
                    break;
                case '4':
                    System.out.println("Senior");
            }
        }
    }
}
