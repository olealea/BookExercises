package CH3_Selections;

import java.util.Scanner;

/**
 * (Financials: currency exchange) Write a program that prompts the user to enter
 the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 Here are the sample runs:

 Enter the exchange rate from dollars to RMB: 6.81
 Enter 0 to convert dollars to RMB and 1 vice versa: 0
 Enter the dollar amount: 100
 $100.0 is 681.0 yuan

 Enter the exchange rate from dollars to RMB: 6.81
 Enter 0 to convert dollars to RMB and 1 vice versa: 5
 Enter the RMB amount: 10000
 10000.0 yuan is $1468.43

 Enter the exchange rate from dollars to RMB: 6.81
 Enter 0 to convert dollars to RMB and 1 vice versa: 5
 Incorrect input
 */
public class ex31_Financials_CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();

        if (convert == 0) {
            System.out.println("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();
            System.out.printf("$%.2f is %.2f yuan", dollarAmount, dollarAmount * rate);
        } else if (convert == 1){
            System.out.println("Enter the RMB amount: ");
            double rmbAmount = input.nextDouble();
            System.out.printf("$%.2f is %.2f yuan", rmbAmount, rmbAmount / rate);
        } else {
            System.out.println("Incorrect input");
        }
    }


}
