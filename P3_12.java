/*The Shape class should also have a method public String
getinfo() that returns a string containing the shape’s
color. Each subclass should override the getinfo() method
to include its own specific attributes in the returned
string. */
class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getinfo() {
        return "Color: " + color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getinfo() {
        return "Color: " + color + "\nArea: " + area();
    }
}

class Square extends Shape {
    double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public String getinfo() {
        return "Color: " + color + "\nArea: " + area();
    }
}

public class P3_12 {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        Square s = new Square("Blue", 4.0);

        System.out.println(c.getinfo());
        System.out.println(s.getinfo());
    }
}