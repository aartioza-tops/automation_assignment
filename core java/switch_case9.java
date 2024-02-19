/*
 *  W.J.P to use of switch case
 * */
package demo;

import java.util.Scanner;
public class switch_case9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		System.out.println("Enter number between 1 to 7");
		Scanner myObj = new Scanner(System.in);
		
		String inputNumber1 = myObj.nextLine();  // Read user input
		a = Integer.parseInt(inputNumber1);
		
		switch(a) {
			
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Wrong input");
			break;
		
		}
	}

}
