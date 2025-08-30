// Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;

public class L2Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Perform double operations (same precedence rules)
        double result1 = a + b * c;     // Multiplication before addition
        double result2 = a * b + c;     // Multiplication before addition
        double result3 = c + a / b;     // Division before addition
        double result4 = a % b + c;     // Modulus before addition (works with doubles too in Java)

        // Print results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
