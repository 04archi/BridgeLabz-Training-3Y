// Interface for Department
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Abstract Employee class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
    }

    abstract double calculateSalary();
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary() + 2000;  // Fixed bonus for full-time
    }

    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    public double calculateSalary() {
        return getBaseSalary() + (workHours * 20);  // Hourly rate
    }

    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Main class to test
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 5000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 2000, 80);

        // Assign departments
        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("Support");

        Employee[] employees = {e1, e2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
            System.out.println("Calculated Salary: $" + emp.calculateSalary());
            System.out.println("---------------------------");
        }
    }
}
