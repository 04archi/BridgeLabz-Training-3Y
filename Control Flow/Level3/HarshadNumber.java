package Level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        // Find sum of digits
        while (temp > 0) {
            int digit = temp % 10;  // last digit
            sum += digit;           // add to sum
            temp /= 10;             // remove last digit
        }

        // Check Harshad condition
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is NOT a Harshad Number");
        }

        sc.close();
    }

}
