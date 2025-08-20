// Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.

import java.util.Scanner;

public class L1Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula: nC2 = (n * (n - 1)) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + handshakes);

        input.close();
    }
}
