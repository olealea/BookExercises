package CH4_MathFunctionsCharactersAndStrings;

/**
 * (Random character) Write a program that displays a random uppercase letter
 * using the Math.random() method.
 */
public class ex16_RandomCharacter {
    public static void main(String[] args) {

        System.out.println("Random uppercase letter: " + (char) (65 + Math.random() * 25));

    }
}
