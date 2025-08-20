// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
// Hint => 
// Create a variable named fee and assign 125000 to it.
// Create another variable discountPercent and assign 10 to it.
// Compute discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

public class L1Q6 {
    public static void main(String[] args) {
        double fee = 125000;              // Original course fee
        double discountPercent = 10;      // Discount percentage

        double discount = (fee * discountPercent) / 100;  // Discount amount
        double finalFee = fee - discount;                 // Fee after discount

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
