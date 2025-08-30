package Level2;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height: ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = sc.nextInt();

        // Youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Youngest is Amar");
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");

        // Tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony)
            System.out.println("Tallest is Amar");
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony)
            System.out.println("Tallest is Akbar");
        else
            System.out.println("Tallest is Anthony");

        sc.close();
    }
}
