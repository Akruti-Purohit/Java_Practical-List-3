
/*Create a Java program that models a hierarchy of shapes.
The hierarchy should include a Shape class as the base
class, with subclasses Circle, Rectangle, and Triangle. */
import java.util.*;

class Shape {
    double a;
    double b;
    // double area;

    void display() {
        System.out.println("Shape class");
    }

}

class Rectangle extends Shape {
    double area;
    Rectangle(double l, double b) {
        super.a = l;
        super.b = b;
        area =  l * b;
        // super.area = area;
    }

    void display() {
        System.out.println("The area of rectangle is:" +area);
    }
}

class Circle extends Shape {
    double area;
    Circle(double r) {
        super.a = r;
        area = Math.PI * r * r; 
        // super.area = area;   
    }

    void display() {
        System.out.println("The area of circle is:" + area);
    }
}

class Triangle extends Shape {
    double area;
    Triangle(double h, double b) {
        super.a = h;
        super.b = b;
        area = 0.5 * b * h; 
        // super.area = area;     
    }

    void display() {
        System.out.println("The area of triangle is:" + area);
    }
}

public class P3_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Purohit Akruti K.");
        System.out.println("220130318033");

        double l, b, r, h;
        System.out.println("Enter the length and breath of rectangle:");
        l = sc.nextDouble();
        b = sc.nextDouble();

        Shape s1 = new Rectangle(l, b);
        s1.display();
        System.out.println("Enter the radius of circle:");
        r = sc.nextDouble();
        Shape s2 = new Circle(r);
        s2.display();

        System.out.println("Enter the base and height of triangle:");
        b = sc.nextDouble();
        h = sc.nextDouble();
        Shape s3 = new Triangle(h, b);
        s3.display();

        sc.close();
    }

}