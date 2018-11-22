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

        //Latitude and longitude for Atlanta, Georgia: 33.7490° N, 84.3880° W
        double latAtlanta = Math.toRadians(33.7490);
        double longAtlanta = Math.toRadians(84.3880);

        //Latitude and longitude for Orlando, Florida: 28.5383° N, 81.3792° W
        double latOrlando = Math.toRadians(28.5383);
        double longOrlando = Math.toRadians(81.3792);

        //Latitude and longitude for Savannah, Georgia: 32.0809° N, 81.0912° W
        double latSavannah = Math.toRadians(32.0809);
        double longSavannah = Math.toRadians(81.0912);

        //Latitude and longitude for Charlotte, North Carolina: 35.2271° N, 80.8431° W
        double latCharlotte = Math.toRadians(35.2271);
        double longCharlotte = Math.toRadians(80.8431);

        double distanceAO = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(latAtlanta) * Math.sin(latOrlando) +
                Math.cos(latAtlanta) * Math.cos(latOrlando) * Math.cos(longAtlanta - longOrlando));

        double distanceAC = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(latAtlanta) * Math.sin(latCharlotte) +
                Math.cos(latAtlanta) * Math.cos(latCharlotte) * Math.cos(longAtlanta - longCharlotte));

        double distanceAS = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(latAtlanta) * Math.sin(latSavannah) +
                Math.cos(latAtlanta) * Math.cos(latSavannah) * Math.cos(longAtlanta - longSavannah));

        double distanceSC = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(latSavannah) * Math.sin(latCharlotte) +
                Math.cos(latSavannah) * Math.cos(latCharlotte) * Math.cos(longSavannah - longCharlotte));

        double distanceOS = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(latOrlando) * Math.sin(latSavannah) +
                Math.cos(latOrlando) * Math.cos(latSavannah) * Math.cos(longOrlando - longSavannah));

        // Calculating data for "Atlanta - Orlando - Savannah" & "Atlanta - Charlotte - Savannah" triangles

        double semiperimeterAOS = (distanceAO + distanceOS + distanceAS) / 2;

        double semiperimeterACS = (distanceAC + distanceSC + distanceAS) / 2;

        double areaOfAOS = Math.sqrt(semiperimeterAOS * (semiperimeterAOS - distanceAO) *
                (semiperimeterAOS - distanceOS) * (semiperimeterAOS - distanceAS));

        double areaOfACS = Math.sqrt(semiperimeterACS * (semiperimeterACS - distanceAC) *
                (semiperimeterACS - distanceSC) * (semiperimeterACS - distanceAS));

        System.out.printf("The estimated area enclosed by these four cities is %f sq.km", areaOfACS + areaOfAOS);
    }
}
