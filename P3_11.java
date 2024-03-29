/*The Shape class should have a constructor that takes the
shape’s color as an argument. Each subclass should call
super in its constructor to initialize this field. */
// Shape class with a constructor that takes color as an argument
class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape {

    public Circle(String color) {
        super(color);
    }
}

class Square extends Shape {

    public Square(String color) {
        super(color); 
    }
}

public class P3_11 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red");
        Square square = new Square("Blue");

        System.out.println("Circle color: " + circle.color);
        System.out.println("Square color: " + square.color);
    }
}

