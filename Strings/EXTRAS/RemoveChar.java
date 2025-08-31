package Strings.EXTRAS;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println("Modified: " + str.replace(String.valueOf(ch), ""));
    }
}
