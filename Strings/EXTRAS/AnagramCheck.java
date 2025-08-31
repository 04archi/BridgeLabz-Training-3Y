package Strings.EXTRAS;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
        Arrays.sort(a1); Arrays.sort(a2);
        System.out.println(Arrays.equals(a1, a2) ? "Anagrams" : "Not Anagrams");
    }
}
