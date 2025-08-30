package Arrays;

import java.util.Scanner;

public class L1_MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] results = new int[4]; // For 6,7,8,9

        for (int i = 6; i <= 9; i++) {
            results[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[i - 6]);
        }
    }
}
