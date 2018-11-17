package CH1_IntroductionToComputerScienceAndJAVA;

/**(Compute expressions) Write a program that displays the result of
 9.5 * 4.5 - 2.5 * 3
 -------------------
   45.5 - 3.5 .   */
public class ex05_ComputeExpressions {
    public static void main(String[] args) {
        double result;
        result = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println(result);
    }
}
