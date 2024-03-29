//Write a Java Program to explain super keyword.
import java.util.*;
class Person{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;

    Person(){
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
    }
}

class Student extends Person{
    String email;
    String branch;
    Scanner s = new Scanner(System.in);
    Student(){
        super();
        System.out.println("Enter your email id:");
        email = s.nextLine();
        System.out.println("Enter your branch:");
        branch = s.nextLine();
    }

    void display(){
        System.out.println("Your name is:"+super.name);
        System.out.println("Your age is:"+super.age);
        System.out.println("Your email id is:"+email);
        System.out.println("Your branch is:"+branch);
    }
}
public class P3_01 {
    public static void main(String[] args) {
        System.out.println("Purohit Akruti K.");
        System.out.println("220130318033");

        Student stud = new Student();
        stud.display();
    }    
}
