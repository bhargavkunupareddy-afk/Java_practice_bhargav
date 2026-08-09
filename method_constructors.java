class Shape {

    double side;
    double length;
    double breadth;
    double radius;

    // Default Constructor
    Shape() {
        System.out.println("Default Constructor Called");
    }

    // Constructor for Square
    Shape(double side) {
        this.side = side;
    }

    // Constructor for Rectangle
    Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor for Circle
    Shape(double radius, boolean isCircle) {
        this.radius = radius;
    }

    // Display Area of Square
    void displaySquare() {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }

    // Display Area of Rectangle
    void displayRectangle() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    // Display Area of Circle
    void displayCircle() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // Method Overloading for Triangle
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method Overloading for Rhombus
    double calculateArea(double diagonal1, double diagonal2, String shape) {
        return 0.5 * diagonal1 * diagonal2;
    }
}

public class Main {
    public static void main(String[] args) {

        // Default Constructor
        Shape s1 = new Shape();

        // Square
        Shape square = new Shape(4);
        square.displaySquare();

        // Rectangle
        Shape rectangle = new Shape(10, 5);
        rectangle.displayRectangle();

        // Circle
        Shape circle = new Shape(7, true);
        circle.displayCircle();

        // Triangle using Method Overloading
        System.out.println("Area of Triangle = "
                + square.calculateArea(10, 8));

        // Rhombus using Method Overloading
        System.out.println("Area of Rhombus = "
                + square.calculateArea(12, 10, "Rhombus"));
    }
}
