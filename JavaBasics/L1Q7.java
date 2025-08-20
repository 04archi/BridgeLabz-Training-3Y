// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class L1Q7 {
    public static void main(String[] args) {
        double radiusKm = 6378;  // Radius of Earth in kilometers
        double kmToMile = 0.621; // 1 km = 0.621 miles

        // Volume of sphere formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles first
        double radiusMiles = radiusKm * kmToMile;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +" and cubic miles is " + volumeMiles3);
    }
}
