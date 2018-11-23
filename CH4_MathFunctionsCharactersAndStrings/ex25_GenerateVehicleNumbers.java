package CH4_MathFunctionsCharactersAndStrings;

/**
 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of three
 * uppercase letters followed by four digits. Write a program to generate a plate
 * number.
 */
public class ex25_GenerateVehicleNumbers {
    public static void main(String[] args) {

        char letter1, letter2, letter3;

        letter1 = (char) (65 + Math.random() * 25);
        letter2 = (char) (65 + Math.random() * 25);
        letter3 = (char) (65 + Math.random() * 25);

        System.out.println("" + letter1 + letter2 + letter3 + (int)(Math.random() * 10000));

    }
}
