package demo4java;
import java.util.Scanner;

class A{
	void print_value() {
		System.out.println("hiiiii.....");
	}
};
public class first {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A obj = new A();
//		obj.print_value();
//			System.out.println("hello world");
//			
		Scanner myObj = new Scanner(System.in);
		System.out.print("enter integer value");
		int myValue = myObj.nextInt();
		System.out.print(myValue);
		
	}

}
