package Java Methods.Level2;

public class LeapYear {
    public static boolean isLeap(int year) {
        return (year >= 1582) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (isLeap(year)) System.out.println(year + " is a Leap Year");
        else System.out.println(year + " is NOT a Leap Year");
    }
}
