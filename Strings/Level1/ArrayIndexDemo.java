package Strings.Level1;

import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // invalid index
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};

        // generateException(names);
        handleException(names);
    }
}
