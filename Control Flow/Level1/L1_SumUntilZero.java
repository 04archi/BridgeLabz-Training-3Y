import java.util.Scanner;

public class L1_SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;

        System.out.println("Enter numbers (0 to stop):");
        num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.println("Enter another number (0 to stop):");
            num = sc.nextDouble();
        }

        System.out.println("Total sum = " + total);
    }
}
