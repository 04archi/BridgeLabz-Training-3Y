package Strings.EXTRAS;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int res = s1.compareTo(s2);
        if (res == 0) System.out.println("Both are equal");
        else if (res < 0) System.out.println(s1 + " comes before " + s2);
        else System.out.println(s1 + " comes after " + s2);
    }
}
