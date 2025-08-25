import java.util.Scanner;

public class L1_SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int sumWhile = 0, i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop = " + sumWhile);
        System.out.println("Sum using formula   = " + sumFormula);
        System.out.println("Both are equal? " + (sumWhile == sumFormula));
    }
}
