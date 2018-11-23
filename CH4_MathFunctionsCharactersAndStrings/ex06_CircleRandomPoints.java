package CH4_MathFunctionsCharactersAndStrings;

/**
 * See the PNG
 */
public class ex06_CircleRandomPoints {
    private static final int RADIUS = 40;

    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;

        double generatedAngle1 = Math.random() * (2 * Math.PI);
        double generatedAngle2 = Math.random() * (2 * Math.PI);
        double generatedAngle3 = Math.random() * (2 * Math.PI);

        x1 = RADIUS * Math.cos(generatedAngle1);
        y1 = RADIUS * Math.sin(generatedAngle1);
        x2 = RADIUS * Math.cos(generatedAngle2);
        y2 = RADIUS * Math.sin(generatedAngle2);
        x3 = RADIUS * Math.cos(generatedAngle3);
        y3 = RADIUS * Math.sin(generatedAngle3);

        double side1 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double side2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double side3 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        double angle12 = Math.toDegrees(Math.acos(
                (side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2)));
        double angle23 = Math.toDegrees(Math.acos(
                (side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3)));
        double angle13 = Math.toDegrees(Math.acos(
                (side1 * side1 + side3 * side3 - side2 * side2) / (2 * side1 * side3)));

        System.out.printf("Angles are: %f, %f, %f", angle12, angle13, angle23);

    }
}
