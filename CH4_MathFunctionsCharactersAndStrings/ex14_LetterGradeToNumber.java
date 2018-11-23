package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Convert letter grade to number) Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 * 1, or 0. Here is a sample run:
 *
 * Enter a letter grade: B
 * The numeric value for grade B is 3
 * Enter a letter grade: T
 * T is an invalid grade
 */
public class ex14_LetterGradeToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade");
        String s = input.nextLine();
        char grade = s.charAt(0);

        switch (grade){
            case 'A':
                System.out.printf("The numeric value for grade %c is 4", grade);
                break;
            case 'B':
                System.out.printf("The numeric value for grade %c is 3", grade);
                break;
            case 'C':
                System.out.printf("The numeric value for grade %c is 2", grade);
                break;
            case 'D':
                System.out.printf("The numeric value for grade %c is 1", grade);
                break;
            case 'F':
                System.out.printf("The numeric value for grade %c is 0", grade);
                break;
            default:
                System.out.printf("%s is an invalid grade", grade);
        }
    }
}
