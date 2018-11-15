package Ch1_IntroductionCompsProgsJAVA;

/** (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
 and 35 seconds. Write a program that displays the average speed in kilometers per
 hour. (Note that 1 mile is 1.6 kilometers.)  */
public class ex12{
        public static void main(String[] args) {
            int distanceInMiles = 24;
            int timeInSeconds = 40 * 3600 + 40 * 60 + 35;

            //Convert distance to kilometers & time to hours
            double distanceInKm = distanceInMiles / 1.6;
            double timeInHours = timeInSeconds / 3600.0;

            double avgSpeed = distanceInKm / timeInHours;

            System.out.println("Average speed is " + avgSpeed + " kilometers per hour");
        }
}
