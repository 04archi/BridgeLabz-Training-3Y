class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department);
    }
}
