/*Each subclass should have its own specific attributes and
methods. For example:
 Circle should have a radius attribute and a
method to calculate its area.
 Rectangle should have attributes for its width
and height, and methods to calculate its area and
perimeter.
 Triangle should have attributes for its base and
height, and methods to calculate its area and
perimeter. */

import java.lang.Math;

// Shape class
class Shape {
    // Common method to calculate area
    public double calculateArea() {
        return 0.0;
    }

    // Common method to calculate perimeter
    public double calculatePerimeter() {
        return 0.0;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override calculateArea method
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Override calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Override calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class for testing
public class P3_10 {
    public static void main(String[] args) {
        // Example usage
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5, 5, 5);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}