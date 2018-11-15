package Ch1_IntroductionCompsProgsJAVA;

/** (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 seconds. Write a program that displays the average speed in miles per hour. (Note
 that 1 mile is 1.6 kilometers.) */
public class ex10 {
    public static void main(String[] args) {
        int distance = 14;
        double time = 45.5;

        //Convert distance to miles & time to hours
        double distMiles = distance * 1.6;
        double timeHours = time / 60;

        double avgSpeed = distMiles / timeHours;

        System.out.println("Average speed is " + avgSpeed + "miles per hour");
    }
}
