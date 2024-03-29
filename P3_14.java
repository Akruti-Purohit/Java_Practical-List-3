/*Create an abstract class called “Shape” with the following
properties:
    A protected integer called “numberOfsides”
    An abstract method called “calculateArea()” that
    returns a double
*/
abstract class Shape {
    protected int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculateArea();

    public void printNumberOfSides() {
        System.out.println("Number of sides: " + numberOfSides);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(4); // Rectangles have 4 sides
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3); // Triangles have 3 sides
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class P3_14 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(3, 4);

        rectangle.printNumberOfSides();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        triangle.printNumberOfSides();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}