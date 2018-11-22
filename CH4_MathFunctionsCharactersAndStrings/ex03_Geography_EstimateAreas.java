package CH4_MathFunctionsCharactersAndStrings;

/**
 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 * four cities. (Hint: Use the formula in Programming Exercise  4.2 to compute the
 * distance between two cities. Divide the polygon into two triangles and use the
 * formula in Programming Exercise  2.19 to compute the area of a triangle.)
 */
public class ex03_Geography_EstimateAreas {
    private static final double EARTH_AVERAGE_RADIUS = 6371.01;

    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4;

        //Latitude and longitude for Atlanta, Georgia: 33.7490° N, 84.3880° W
        x1 = Math.toRadians(33.7490);
        y1 = Math.toRadians(84.3880);

        //Latitude and longitude for Orlando, Florida: 28.5383° N, 81.3792° W
        x2 = Math.toRadians(28.5383);
        y2 = Math.toRadians(81.3792);

        //Latitude and longitude for Savannah, Georgia: 32.0809° N, 81.0912° W
        x3 = Math.toRadians(32.0809);
        y3 = Math.toRadians(81.0912);

        //Latitude and longitude for Charlotte, North Carolina: 35.2271° N, 80.8431° W
        x4 = Math.toRadians(35.2271);
        y4 = Math.toRadians(80.8431);

        double distanceAO = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)); // Atlanta - Orlando

        double distanceAC = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x4) +
                Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4)); // Atlanta - Charlotte

        double distanceAS = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x3) +
                Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3)); // Atlanta - Savannah

        double distanceSC = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x3) * Math.sin(x4) +
                Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4)); // Savannah - Charlotte

        double distanceOS = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) +
                Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3)); // Orlando - Savannah

        // Semiperimeter for the "Atlanta - Orlando - Savannah" triangle
        double semiperimeterAOS = (distanceAO + distanceOS + distanceAS) / 2;

        // Semiperimeter for the "Atlanta - Charlotte - Savannah" triangle
        double semiperimeterACS = (distanceAC + distanceSC + distanceAS) / 2;

        // Calculating the area of the "Atlanta - Orlando - Savannah" triangle
        double areaOfAOS = Math.sqrt(semiperimeterAOS * (semiperimeterAOS - distanceAO) *
                (semiperimeterAOS - distanceOS) * (semiperimeterAOS - distanceAS));

        // Calculating the area of  the "Atlanta - Charlotte - Savannah" triangle
        double areaOfACS = Math.sqrt(semiperimeterACS * (semiperimeterACS - distanceAC) *
                (semiperimeterACS - distanceSC) * (semiperimeterACS - distanceAS));

        System.out.printf("The estimated area enclosed by these four cities is %f sq.km", areaOfACS + areaOfAOS);
    }
}
