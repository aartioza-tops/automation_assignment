/*
 * 8 - W.J.P to find Maximum from 3 number using else if ladder
 * */
package demo;

import java.util.Scanner;

public class maximum_num_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		System.out.println("Enter value of a");
		Scanner myObj = new Scanner(System.in);
		
		String inputNumber1 = myObj.nextLine();  // Read user input
		a = Integer.parseInt(inputNumber1);
		
		System.out.println("Enter value of b");
		String inputNumber2 = myObj.nextLine(); 
		b = Integer.parseInt(inputNumber2);
		
		System.out.println("Enter value of c");
		String inputNumber3 = myObj.nextLine(); 
		c = Integer.parseInt(inputNumber3);
		
		if(a>b) {
			if(a>c) {
				System.out.println(a +" is biggest");
			}
		}else if(b>c) {
			System.out.println(b+" is biggest");
		}else {
			System.out.println(c+" is biggest");
		}
		
	}

}
