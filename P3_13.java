/*Create a test program that creates instances of Circle,
Rectangle, and Triangle, and calls their repective
getinfo() methods and area/perimeter calculation
methods. */

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
    double radius,a;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        a = Math.PI * radius * radius;
        return a;
    }

    @Override
    public String getinfo() {
        return "Color: " + color + "\nArea: " + a;
    }
}

class Square extends Shape {
    double sideLength,a;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double area() {
        a = sideLength * sideLength;
        return a;
    }

    @Override
    public String getinfo() {
        return "Color: " + color + "\nArea: " + a;
    }
}

class Triangle extends Shape{
    double base,height,a;
    Triangle(String color,double base,double height){
        super(color);
        this.base = base;
        this.height = height;
    }

    public double area(){
        a = 0.5*base*height;
        return a;
    }

    @Override
    public String getinfo() {
        return "Color: " + color + "\nArea:" + a;
    }    
}

public class P3_13 {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        Square s = new Square("Blue", 4.0);
        Triangle t = new Triangle("Pink", 2.4, 1.3);

        
        System.out.println("The area of circle:"+c.area());
        System.out.println(c.getinfo());
        System.out.println("The area of square:"+s.area());
        System.out.println(s.getinfo());
        System.out.println("The area of triangle:"+t.area());
        System.out.println(t.getinfo());
    }
}