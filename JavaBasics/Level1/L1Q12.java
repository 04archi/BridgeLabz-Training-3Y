// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class L1Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height in inches
        System.out.print("Enter base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in inches: ");
        double height = input.nextDouble();

        // Area in square inches
        double areaInInches = 0.5 * base * height;

        // 1 inch = 2.54 cm → 1 square inch = (2.54 * 2.54) = 6.4516 cm²
        double areaInCm = areaInInches * 6.4516;

        // Print output
        System.out.println("The area of triangle is " + areaInInches + " square inches" +" and " + areaInCm + " square centimeters.");

        input.close();
    }
}
