package demo;
import java.util.*; 
import demo.add;
import demo.substract;
import demo.multiplication;
import demo.division;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		
		
		System.out.println("\n1.addition 2.substraction  3.multiplication  4.division");
		System.out.println("enter your choice :");
		Scanner scan=new Scanner(System.in);  
		choice=scan.nextInt();  
		
		switch(choice) {
			
			case 1:
			add a = new add();
			a.sum();
			break;
			
			case 2:
			substract b = new substract();
			b.sub();
			break;
			
			case 3:
			multiplication c = new multiplication();
			c.mul();
			break;
			
			case 4:
			division d = new division();
			d.div();
			break;
			
			default:
			System.out.println("wrong choice....");
			break;
		}
		
		
		
		
		
		
	}

}
