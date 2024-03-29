/*Write a program of interface implementation. */

import java.util.*;

interface info{
    void get();
    void display();
}
class Details implements info{
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    public void get(){
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("your name is:"+name);
        System.out.println("Your age is:"+age);
    }
}
public class P3_03{
    public static void main(String[] args) {
        System.out.println("Purohit Akruti K.");
        System.out.println("220130318033");

        Details d1 = new Details();
        d1.get();
        d1.display();
    }
}
