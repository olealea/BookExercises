package CH2_ElementaryProgramming;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/** (Financial application: compound value) Suppose you save $100 each month
 into a savings account with the annual interest rate 5%. Thus, the monthly interest
 rate is 0.05/12 = 0.00417. After the first month, the value in the account
 becomes
    100 * (1 + 0.00417) = 100.417
 After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
 After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
 and so on.
 Write a program that prompts the user to enter a monthly saving amount and
 displays the account value after the sixth month. (In Exercise 5.30, you will use a
 loop to simplify the code and display the account value for any month.)
        Enter the monthly saving amount: 100
        After the sixth month, the account value is $608.81 */
public class ex13_FinancialApp_CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        int amount = input.nextInt();

        double monthlyRate = 0.00417;

        double value = 0;
        for(int i = 0; i < 6; i++) {
            value = (amount + value) * (1 + monthlyRate);

            if (i == 5) {
                DecimalFormat df = new DecimalFormat("###.##");
                df.setRoundingMode(RoundingMode.DOWN);

                System.out.println("After the sixth month, the account value is $" + df.format(value));
            }
        }
    }
}
