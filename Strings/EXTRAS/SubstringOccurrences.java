package Strings.EXTRAS;

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(), sub = sc.nextLine();
        int count = 0, idx = 0;
        while ((idx = text.indexOf(sub, idx)) != -1) {
            count++; idx += sub.length();
        }
        System.out.println("Occurrences: " + count);
    }
}
