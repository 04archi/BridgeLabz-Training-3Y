package Strings.Level2;

import java.util.Scanner;

public class Program6_CapitalizeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(ch)) != -1) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println("Modified Sentence: " + result);
    }
}
