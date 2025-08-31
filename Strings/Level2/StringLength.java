package Strings.Level2;

import java.util.Scanner;

public class StringLength {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {  // infinite loop
                str.charAt(count); // will throw exception when index is out of bound
                count++;
            }
        } catch (Exception e) {
            // do nothing, exception ends loop
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Call user-defined method
        int myLength = findLength(input);

        // Use built-in length() for comparison
        int builtinLength = input.length();

        // Display result
        System.out.println("Length (User-Defined): " + myLength);
        System.out.println("Length (Built-in): " + builtinLength);

        sc.close();
    }
}
