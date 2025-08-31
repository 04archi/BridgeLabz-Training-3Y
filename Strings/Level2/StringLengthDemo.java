package Strings.Level2;

import java.util.Scanner;

public class StringLengthDemo {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) { // infinite loop until exception
                str.charAt(count); // will throw exception when out of bounds
                count++;
            }
        } catch (Exception e) {
            // Exception occurs → means we've reached the end
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Using custom method
        int customLength = findLength(input);

        // Using built-in method
        int builtinLength = input.length();

        // Display results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtinLength);
    }
}
