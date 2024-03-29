import java.util.*;

public class P3_02{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year:");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("This is a leap year.");
		}
		else{
			System.out.println("This is not a leap year.");
		}
	}
}
