package CH3_Selections;

/**
 * (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 */
public class ex16_RandomPoint {
    public static void main(String[] args) {

        System.out.printf("Random coordinate for 100x200 rectangle is: (%.5f, %.5f)",
                Math.random() * 100, Math.random() * 200);

    }
}


