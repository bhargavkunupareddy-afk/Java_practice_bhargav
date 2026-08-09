class Calculator {

    // 1. Add two numbers
    public int calculate(int a, int b) {
        return a + b;
    }

    // 2. Area of Circle
    public int calculate(int radius) {
        return (int) (3.14 * radius * radius);
    }

    // 3. Area of Rectangle
    public int calculate(int length, int breadth, int choice) {
        return length * breadth;
    }

    // 4. Area of Square
    public int calculate(int side, double choice) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Addition: " + obj.calculate(10, 20));

        System.out.println("Area of Circle: " + obj.calculate(5));

        System.out.println("Area of Rectangle: " + obj.calculate(10, 5, 1));

        System.out.println("Area of Square: " + obj.calculate(4, 1.0));
    }
}
