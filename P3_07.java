import java.util.*;
// import java.lang.*;

interface Detail1 {
    void getDetail();
}

interface Show {
    void display();
}

class Human implements Detail1, Show {
    String name;
    int age;

    public void getDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class P3_07 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.getDetail();
        h1.display();
    }
}
