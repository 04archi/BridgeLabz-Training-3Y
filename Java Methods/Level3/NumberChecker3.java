package Java Methods.Level3;

public class NumberChecker3 {
    public static void main(String[] args) {
        int num = 121;
        int[] d = getDigits(num);
        System.out.println("Palindrome: " + isPalindrome(d));
    }

    static int[] getDigits(int n) { return String.valueOf(n).chars().map(c -> c - '0').toArray(); }
    static int[] reverse(int[] arr) { int[] r = arr.clone(); for (int i=0,j=r.length-1;i<j;i++,j--){int t=r[i];r[i]=r[j];r[j]=t;} return r; }
    static boolean compare(int[] a, int[] b) { return Arrays.equals(a, b); }
    static boolean isPalindrome(int[] d) { return compare(d, reverse(d)); }
}
