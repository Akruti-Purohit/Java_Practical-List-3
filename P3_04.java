import java.util.*;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	void intro(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Student extends Person{
	Scanner stud = new Scanner(System.in);

	Student(String name, int age) {
        		super(name, age);
	}

	void intro(){
		System.out.print("Enter your standard:");
		int std = stud.nextInt();
		stud.nextLine();
		System.out.print("Enter your school name:");
		String school_n = stud.nextLine();	
		System.out.println("Name:"+super.name);
		System.out.println("Age:"+super.age);
		System.out.println("Standard:"+std);
		System.out.println("School:"+school_n);
	}
}
class Employee extends Person{
	Scanner emp = new Scanner(System.in);
	Employee(String name, int age) {
		super(name, age);
	}

	void intro(){
		System.out.print("Enter your desingnation:");
		String dsg = emp.nextLine();
		System.out.print("Enter your company name:");
		String company_n = emp.nextLine();	
		System.out.println("Name:"+super.name);
		System.out.println("Age:"+super.age);
		System.out.println("Desingnation:"+dsg);
		System.out.println("Company:"+company_n);
	}
}

public class P3_04{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = "Akruti Purohit";
		int age = 17;
		System.out.print("Enter S or s for Student and E or e for Employee:");
		char verify = sc.next().charAt(0);
		if(verify == 'S' || verify == 's')
		{
			Student s1 = new Student(name,age);
			s1.intro();
		}
		else if(verify == 'E' || verify == 'e')
		{
			Employee e1 = new Employee(name,age);
			
			e1.intro();
		}
		else{
			System.out.println("Enter valid varification code!!!");
	
		}
	}
}
