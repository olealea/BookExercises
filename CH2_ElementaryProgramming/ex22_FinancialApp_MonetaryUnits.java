package CH2_ElementaryProgramming;

import java.util.Scanner;

/** (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
 .java, to fix the possible loss of accuracy when converting a double value to an
 int value. Enter the input as an integer whose last two digits represent the cents.
 For example, the input 1156 represents 11 dollars and 56 cents.*/
public class ex22_FinancialApp_MonetaryUnits {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Enter an integer amount, last two digits to be cents: ");
         int amount = input.nextInt();

         // Find the number of one dollars
         int numberOfOneDollars = amount / 100;
         int remainingAmount = amount % 100;

         // Find the number of quarters in the remaining amount
         int numberOfQuarters = remainingAmount / 25;
         remainingAmount = remainingAmount % 25;

         // Find the number of dimes in the remaining amount
         int numberOfDimes = remainingAmount / 10;
         remainingAmount = remainingAmount % 10;

         // Find the number of nickels in the remaining amount
         int numberOfNickels = remainingAmount / 5;
         remainingAmount = remainingAmount % 5;

         // Find the number of pennies in the remaining amount
         int numberOfPennies = remainingAmount;

         // Display results
         System.out.println("Your amount " + amount + " consists of");
         System.out.println(" " + numberOfOneDollars + " dollars");
         System.out.println(" " + numberOfQuarters + " quarters ");
         System.out.println(" " + numberOfDimes + " dimes");
         System.out.println(" " + numberOfNickels + " nickels");
         System.out.println(" " + numberOfPennies + " pennies");
         }
}
