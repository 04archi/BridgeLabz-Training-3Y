package Extras_Built-in;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input date
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);

        // Add days, months, years
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        result = result.minusWeeks(3);

        System.out.println("Final date after operations: " + result);
    }
}
