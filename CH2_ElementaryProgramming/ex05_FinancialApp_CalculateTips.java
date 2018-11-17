package CH2_ElementaryProgramming;

import java.util.Scanner;

/** (Financial application: calculate tips) Write a program that reads the subtotal
 and the gratuity rate, then computes the gratuity and total. For example, if the
 user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 as gratuity and $11.5 as total. Here is a sample run:
        Enter the subtotal and a gratuity rate: 10 15
        The gratuity is $1.5 and total is $11.5  */
public class ex05_FinancialApp_CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        //Calculate gratuity and total
        double gratuity = gratuityRate / subtotal;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
