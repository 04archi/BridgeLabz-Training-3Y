// Create a program to convert the distance of 10.8 kilometers to miles.
// Hint: 1 km = 1.6 miles
// I/P => NONE
// O/P => The distance  ___ km in miles is ___

public class L1Q3 {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double conversionFactor = 1.6;  // 1 km = 1.6 miles
        double miles = kilometers * conversionFactor;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
