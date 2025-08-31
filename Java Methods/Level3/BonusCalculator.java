package Java Methods.Level3;

public class BonusCalculator {
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] employees = new double[10][2]; // [salary, yearsOfService]

        // Generate random salary (5-digit) and years of service (1-10 years)
        for (int i = 0; i < 10; i++) {
            employees[i][0] = 10000 + rand.nextInt(90000); 
            employees[i][1] = 1 + rand.nextInt(10);
        }

        double[][] results = calculateBonus(employees);

        displayTable(employees, results);
    }

    public static double[][] calculateBonus(double[][] employees) {
        double[][] results = new double[10][2]; // [newSalary, bonus]
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            results[i][0] = salary + bonus;
            results[i][1] = bonus;
        }
        return results;
    }

    public static void displayTable(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-10s %-12s %-12s %-12s %-12s\n", "EmpID", "OldSalary", "Years", "NewSalary", "Bonus");

        for (int i = 0; i < oldData.length; i++) {
            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%-10d %-12.2f %-12.0f %-12.2f %-12.2f\n", (i+1), oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
        }
        System.out.println("----------------------------------------------------------");
        System.out.printf("Total     %-12.2f %-12s %-12.2f %-12.2f\n", totalOld, "-", totalNew, totalBonus);
    }
}
