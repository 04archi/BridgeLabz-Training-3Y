package Extras_Built-in;

public class DateComparisonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two dates
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // Compare
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }
    }
}
