package Strings.Level2;

import java.util.Scanner;

public class Program7_StringToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String str = sc.next();

        int num = Integer.parseInt(str);
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of Digits: " + sum);
    }
}
