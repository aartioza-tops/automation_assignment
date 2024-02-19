/*
 * 7 - W.J.P to find Positive ,Negative and Zero using nested if
 * */
package demo;

import java.util.Scanner;

public class positive_nagetive7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		System.out.println("Enter any number");
		Scanner myObj = new Scanner(System.in);
		String inputNumber = myObj.nextLine();  // Read user input
		number = Integer.parseInt(inputNumber);
		
		if(number > 0) {
			if(number == 0) {
				System.out.println("Zero number");
			}else {
				System.out.println("Positive");
			}
		}else {
			if(number == 0) {
				System.out.println("Zero number");
			}else {
				System.out.println("Negative");
			}
		}
	}

}
