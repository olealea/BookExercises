package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Please find  the .PNG file from this package*/
public class ex21_FinancialApp_FutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();

        //Calculate future investment value
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double futureInvestment = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Accumulated value is $" + df.format(futureInvestment));
    }
}
