package Java Methods.Level1;

public class QuotRem {
    public static int[] findRemainderAndQuotient(int n, int d) {
        return new int[]{n % d, n / d};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int[] res = findRemainderAndQuotient(n, d);
        System.out.println("Quotient = " + res[1] + ", Remainder = " + res[0]);
    }
}
