// Write a program to find the distance in yards and miles for the distance provided by the user in feet
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => The distance in yards is ___ while the distance in miles is ___

import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet → yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3.0;

        // Convert yards → miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760.0;

        // Print results
        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);

        input.close();
    }
}
