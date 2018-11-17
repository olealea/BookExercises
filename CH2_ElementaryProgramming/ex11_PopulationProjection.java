package CH2_ElementaryProgramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer. Here is a sample run of the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 */
public class ex11_PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        int currentPopulation = 312_032_486;
        int secondsPerYear = 31_536_000;
        double birthPerYear = secondsPerYear / 7.0;
        double deathPerYear = secondsPerYear / 13.0;
        double immigrantPerYear = secondsPerYear / 45.0;

        //Calculate, round and convert to int the population number
        int calculatedPopulation = (int)Math.round(currentPopulation +
                (birthPerYear - deathPerYear + immigrantPerYear) * numberOfYears);

        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println("The population in " + numberOfYears + " years is "
                + df.format(calculatedPopulation));
    }
}
