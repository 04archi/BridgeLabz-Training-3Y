package Strings.EXTRAS;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next(), newWord = sc.next();
        System.out.println("Modified: " + sentence.replace(oldWord, newWord));
    }
}
