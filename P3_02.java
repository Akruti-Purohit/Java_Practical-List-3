import java.util.*;

class Leapyear{
	int year;
	Leapyear(int year){
		this.year = year;
	}
}
class Check{
	Check(int year){
		super(year);
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("This is a leap year.");
		}
		else{
			System.out.println("This is not a leap year.");
		}
	}
}

public class P3_02{
	public static void main(String args[]){
		Check y1 = new Check(2000);
	}
}