class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void displayAreaAndCircumference() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayAreaAndCircumference();
    }
}
