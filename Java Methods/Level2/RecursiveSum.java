package Java Methods.Level2;

public class RecursiveSum {
    public static int sumRec(int n) {
        if (n == 0) return 0;
        return n + sumRec(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }
        int rec = sumRec(n);
        int formula = sumFormula(n);
        System.out.println("Recursive Sum = " + rec);
        System.out.println("Formula Sum = " + formula);
        System.out.println("Both are equal: " + (rec == formula));
    }
}
