package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 * java, to fix the possible loss of accuracy when converting a float value to an int
 * value. Read the input as a string such as "11.56". Your program should extract
 * the dollar amount before the decimal point and the cents after the decimal amount
 * using the indexOf and substring methods.
 */
public class ex26_FinancialApp_MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        String amount = input.nextLine();

        int numberOfOneDollars = Integer.parseInt(amount.substring(0,amount.indexOf(".")));
        int remainingAmount = Integer.parseInt(amount.substring(amount.indexOf(".")+1));

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
