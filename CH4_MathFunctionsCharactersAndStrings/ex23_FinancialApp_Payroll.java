package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Financial application: payroll) Write a program that reads the following information
 * and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 * A sample run is shown below:
 * <p>
 * Enter employee's name: Smith
 * Enter number of hours worked in a week: 10
 * Enter hourly pay rate: 9.75
 * Enter federal tax withholding rate: 0.20
 * Enter state tax withholding rate: 0.09
 * <p>
 * Employee Name: Smith
 * Hours Worked: 10.0
 * Pay Rate: $9.75
 * Gross Pay: $97.5
 * Deductions:
 * Federal Withholding (20.0%): $19.5
 * State Withholding (9.0%): $8.77
 * Total Deduction: $28.27
 * Net Pay: $69.22
 */
public class ex23_FinancialApp_Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grossPay, federalWithhold, stateWithhold, deduction;

        System.out.println("Enter employee's name: ");
        String name = input.nextLine();

        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        grossPay = hours * payRate;
        federalWithhold = federalTaxRate * grossPay;
        stateWithhold = stateTaxRate * grossPay;
        deduction = federalWithhold + stateWithhold;

        System.out.printf("Employee Name: %s\nHours Worked: %.2f\n" +
                        "Pay Rate: %.2f\nGross Pay: %.2f\n Deductions:\n\tFederal Withholding (20.0%%): %.2f" +
                        "\n\tState Withholding (9.0%%): %.2f\n\ttotal Deduction: %.2f\nNet Pay: %.2f",
                name, hours, payRate, grossPay, federalWithhold, stateWithhold, deduction, grossPay - deduction);
    }
}
