package Java Methods.Level1;

public class TriangularPark {
    public static double findRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5 km = 5000 m
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Rounds needed = " + findRounds(a, b, c));
    }
}
