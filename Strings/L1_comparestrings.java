package Strings;

import java.util.Scanner;

public class L1_comparestrings {
    public static void compareStringsDemo() { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first string: "); 
        String s1 = sc.next(); 
        System.out.print("Enter second string: "); 
        String s2 = sc.next(); 
 
        boolean manual = compareStrings(s1, s2); 
        boolean builtin = s1.equals(s2); 
 
        System.out.println("Manual comparison: " + manual); 
        System.out.println("Built-in equals(): " + builtin); 
    }
}
