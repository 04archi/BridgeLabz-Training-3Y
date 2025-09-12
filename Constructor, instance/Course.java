class Course {
    String courseName;
    int duration;  // in weeks
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: $" + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
