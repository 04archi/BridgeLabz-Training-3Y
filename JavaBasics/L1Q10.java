// Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class L1Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take height input from user in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert cm to total inches
        double totalInches = heightCm / 2.54;

        // Find feet and remaining inches
        int feet = (int) (totalInches / 12);
        int inches = (int) (totalInches % 12);

        System.out.println("Your Height in cm is " + heightCm +" while in feet is " + feet +" and inches is " + inches);

        input.close();
    }
}
