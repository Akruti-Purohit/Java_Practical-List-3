/*Write a program that illustrates interface inheritance.
Interface P12 inherits from both P1 and P2. Each
interface declares one constant and one method. The
class Q implements P12. Instantiate Q and invoke each of
its methods. */

interface P1{
    final int a = 21;
    void print();
}

interface P2{
    final int b = 45;
    void display();
}

interface P12 extends P1,P2{
    final int c = 67;
    int add();
}

class Q implements P12{
    public void print(){
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        System.out.println("The value of c is:"+c);
    }

    public int add(){
        return a+b+c;
    }

    public void display(){
        System.out.println("The sum of a,b and c is:"+add());
    }


}
public class P3_08 {
    public static void main(String[] args) {
        Q q1 = new Q();
        q1.print();
        q1.add();
        q1.display();
    }
}