/*Write a Java program to demonstrate multilevel
Inheritance. */
import java.util.Scanner;

class info {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;

    void get() {
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
    }
}

class Detail extends info {
    Scanner sc = new Scanner(System.in);
    String country;
    String state;
    String city;

    void getter() {
        System.out.println("Enter your contry:");
        country = sc.nextLine();
        System.out.println("Enter your state:");
        state = sc.nextLine();
        System.out.println("Enter your city:");
        city = sc.nextLine();
    }
}

class Person extends Detail {
    Scanner sc = new Scanner(System.in);
    long ph_no;
    String email;

    void gets() {
        super.get();
        super.getter();
        System.out.println("Enter your phone number:");
        ph_no = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your email id:");
        email = sc.nextLine();
    }

    void display() {
        System.out.println("All Details of person.....");
        System.out.println("Name:" + super.name);
        System.out.println("Age:" + super.age);
        System.out.println("Country:" + super.country);
        System.out.println("State:" + super.state);
        System.out.println("City:" + super.city);
        System.out.println("Phone number:" + ph_no);
        System.out.println("Email id:" + email);
    }
}

public class P3_05 {
    public static void main(String[] args) {
        System.out.println("Purohit Akruti K.");
        System.out.println("220130318033");

        Person p1 = new Person();
        p1.gets();
        p1.display();
    }
}