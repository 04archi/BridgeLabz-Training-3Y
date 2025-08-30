package Arrays.Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (in meters) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            System.out.println("Enter weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("\nPerson " + (i + 1) + ": ");
            System.out.println("Height: " + height[i] + " m, Weight: " + weight[i] + " kg, BMI: " + bmi[i]);

            if (bmi[i] < 18.5)
                System.out.println("Status: Underweight");
            else if (bmi[i] < 25)
                System.out.println("Status: Normal weight");
            else if (bmi[i] < 30)
                System.out.println("Status: Overweight");
            else
                System.out.println("Status: Obese");
        }
    }
}
