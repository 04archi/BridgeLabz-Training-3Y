package Java Methods.Level3;

public class NumberChecker {
    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);

        System.out.println("Duck Number: " + isDuck(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));
        largestAndSecondLargest(digits);
        smallestAndSecondSmallest(digits);
    }

    static int countDigits(int n) { return String.valueOf(n).length(); }

    static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    static boolean isDuck(int n) { return String.valueOf(n).contains("0"); }

    static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int pow = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, pow);
        return sum == n;
    }

    static void largestAndSecondLargest(int[] d) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > first) { second = first; first = x; }
            else if (x > second && x != first) second = x;
        }
        System.out.println("Largest: " + first + ", 2nd Largest: " + second);
    }

    static void smallestAndSecondSmallest(int[] d) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < first) { second = first; first = x; }
            else if (x < second && x != first) second = x;
        }
        System.out.println("Smallest: " + first + ", 2nd Smallest: " + second);
    }
}
