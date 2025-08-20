// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
// Hint => 
// Create a variable named fee and take user input for fee.
// Create another variable discountPercent and take user input.
// Compute the discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.
// I/P => fee, discountPrecent
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

import java.util.Scanner;

public class L1Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;   // Discount amount
        double finalFee = fee - discount;                  // Fee after discount

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
