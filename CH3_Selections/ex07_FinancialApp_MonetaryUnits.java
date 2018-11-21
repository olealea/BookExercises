package CH3_Selections;

import java.util.Scanner;

/**
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange
 .java, to display the nonzero denominations only, using singular words for single
 units such as 1 dollar and 1 penny, and plural words for more than one unit such
 as 2 dollars and 3 pennies.
 */
public class ex07_FinancialApp_MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer amount, last two digits to be cents: ");
        int amount = input.nextInt();

        int numberOfOneDollars = amount / 100;
        int remainingAmount = amount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if (numberOfOneDollars !=0){
           System.out.println((numberOfOneDollars == 1) ?
                   numberOfOneDollars + " dollar" : numberOfOneDollars + " dollars" );
        }

        if (numberOfQuarters !=0){
            System.out.println((numberOfQuarters == 1) ?
                    numberOfQuarters + " quarter" : numberOfQuarters + " quarters" );
        }

        if (numberOfDimes !=0){
            System.out.println((numberOfDimes == 1) ?
                    numberOfDimes + " dime" : numberOfDimes + " dimes" );
        }

        if (numberOfNickels !=0){
            System.out.println((numberOfNickels == 1) ?
                    numberOfNickels + " nickle" : numberOfNickels + " nickles" );
        }

        if (numberOfPennies !=0){
            System.out.println((numberOfPennies == 1) ?
                    numberOfPennies + " penny" : numberOfPennies + " pennies" );
        }
    }
}
