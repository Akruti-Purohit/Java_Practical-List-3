abstract class Shape {
    protected int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(4);
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
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

public class P3_15{
    public static void printShapeArea(Shape shape) {
        System.out.println("Area of the shape: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(3, 4);

        printShapeArea(rectangle);
        printShapeArea(triangle);
    }
}
