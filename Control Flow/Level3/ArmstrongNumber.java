package Level3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // Store original number
        int sum = 0;

        // Loop through digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;    // get last digit
            sum += digit * digit * digit;      // cube of digit and add to sum
            originalNumber = originalNumber / 10; // remove last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }

        sc.close();
    }
}
