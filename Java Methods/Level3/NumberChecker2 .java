package Java Methods.Level3;

public class NumberChecker2  {
    public static void main(String[] args) {
        int num = 21;
        int[] digits = getDigits(num);

        System.out.println("Sum of digits: " + sum(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(num));
        digitFrequency(num);
    }

    static int[] getDigits(int n) { return String.valueOf(n).chars().map(c -> c - '0').toArray(); }
    static int sum(int[] d) { return Arrays.stream(d).sum(); }
    static int sumSquares(int[] d) { return Arrays.stream(d).map(x -> (int)Math.pow(x, 2)).sum(); }
    static boolean isHarshad(int n) { return n % sum(getDigits(n)) == 0; }

    static void digitFrequency(int n) {
        int[] freq = new int[10];
        for (int d : getDigits(n)) freq[d]++;
        for (int i = 0; i < 10; i++) if (freq[i] > 0) System.out.println(i + " → " + freq[i]);
    }
}
