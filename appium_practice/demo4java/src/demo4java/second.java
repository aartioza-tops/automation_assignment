package demo4java;
import java.util.Scanner;

class employee{
	int empId;
	String empname;
	double salary;
	employee(){
		
	}
	
	public employee(int a,String b,double d) {
		// TODO Auto-generated constructor stub
		empId=a;
		empname = b;
		salary=d;
	}
	
	employee(employee obj){
		empId=obj.empId;
		empname = obj.empname;
		salary = obj.salary;
		
	}
	void print_data() {
		System.out.println("\nemployee id " + empId + "\nemployee name " + empname + "\nemployee salary " + salary);;
	}
}

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter your values");
		
		Scanner myObj = new Scanner(System.in);
		
		int eid = myObj.nextInt();
		String ename = myObj.next();
		double esalary = myObj.nextDouble();
			
			employee e1 = new employee(eid,ename,esalary);
			e1.print_data();
			employee e2 = new employee(e1);
			e2.print_data();
			
	}

}