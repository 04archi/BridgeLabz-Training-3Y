class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0);  // Calls parameterized constructor
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }
}
