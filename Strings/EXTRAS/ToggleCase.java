package Strings.EXTRAS;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), result = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) result += Character.toLowerCase(c);
            else result += Character.toUpperCase(c);
        }
        System.out.println("Toggled: " + result);
    }
}
