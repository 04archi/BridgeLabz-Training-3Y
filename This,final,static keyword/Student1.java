public class Student1 {
    static String universityName = "National University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1, "A");
        Student s2 = new Student("Bob", 2, "B");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}

