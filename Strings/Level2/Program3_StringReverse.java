package Strings.Level2;

import java.util.Scanner;

public class Program3_StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);
    }
}
