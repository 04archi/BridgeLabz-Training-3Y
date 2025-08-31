package Strings.EXTRAS;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxCount = 0; char freqChar = ' ';
        for (char c : str.toCharArray()) {
            int count = 0;
            for (char x : str.toCharArray()) if (x == c) count++;
            if (count > maxCount) { maxCount = count; freqChar = c; }
        }
        System.out.println("Most Frequent: " + freqChar);
    }
}
