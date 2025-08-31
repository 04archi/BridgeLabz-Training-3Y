package Strings.Level2;

import java.util.Scanner;

public class Program4_CompareStrings {
    public static boolean manualCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        System.out.println("Manual Comparison: " + manualCompare(s1, s2));
        System.out.println("Built-in Comparison: " + s1.equals(s2));
    }
}
