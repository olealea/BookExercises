package Ch1_IntroductionCompsProgsJAVA;

/** Please find  the ex13.PNG file from this package*/
public class ex13 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 5.5;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("Solution is: ");
        System.out.println("x = " + x + " and y = " + y + ".");
    }
}
