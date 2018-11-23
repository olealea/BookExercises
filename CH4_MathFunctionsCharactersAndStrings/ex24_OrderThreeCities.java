package CH4_MathFunctionsCharactersAndStrings;

import java.util.Scanner;

/**
 * (Order three cities) Write a program that prompts the user to enter three cities and
 * displays them in ascending order. Here is a sample run:
 * <p>
 * Enter the first city: Chicago
 * Enter the second city: Los Angeles
 * Enter the third city: Atlanta
 */
public class ex24_OrderThreeCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.println("Enter the third city: ");
        String city3 = input.nextLine();

        String[] cities = {city1, city2, city3};
        for (int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 3; ++j) {
                if (cities[i].compareTo(cities[j]) > 0) {

                    // swap words[i] with words[j[
                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");
        for (int i = 0; i < 3; i++) {
            System.out.println(cities[i]);
        }

    }
}



