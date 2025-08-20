// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
// I/P => base, height
// O/P => The Area of the triangle in sq in is ___ and sq cm is ___

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height in centimeters
        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert cm² to in² (1 inch = 2.54 cm → 1 in² = 2.54² = 6.4516 cm²)
        double areaInches = areaCm / 6.4516;

        // Print result
        System.out.println("The Area of the triangle in sq in is " + areaInches +" and sq cm is " + areaCm);

        input.close();
    }
}
