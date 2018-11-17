package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** (Financial application: calculate interest) If you know the balance and the annual
 percentage interest rate, you can compute the interest on the next monthly payment
 using the following formula:
        interest = balance * (annualInterestRate/1200)
 Write a program that reads the balance and the annual percentage interest rate and
 displays the interest for the next month. Here is a sample run
        Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
        The interest is 2.91667 */
public class ex20_FinancialApp_CalculateInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        int balance = input.nextInt();
        double interestRate = input.nextDouble();

        //Calculate the interest
        double interest = balance * (interestRate / 1200);

        DecimalFormat df = new DecimalFormat("###.#####");
        System.out.println("The interest is " + df.format(interest));
    }
}
