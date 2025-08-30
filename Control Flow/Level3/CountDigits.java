package Level3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // handle negative numbers too

        if (temp == 0) {
            count = 1; // Special case: 0 has 1 digit
        } else {
            while (temp != 0) {
                temp = temp / 10; // remove last digit
                count++;
            }
        }

        System.out.println("The number of digits in " + number + " is: " + count);

        sc.close();
    }
}
