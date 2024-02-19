//  W.J.P to Perform OddEven Number 

package demo;
import java.util.Scanner;
public class oddEven_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number;
			
			System.out.println("Enter any number");
			
			Scanner myObj = new Scanner(System.in);
			String inputNumber = myObj.nextLine();  // Read user input
			number = Integer.parseInt(inputNumber);
			
			if(number%2==0) {
				System.out.println("even number");
			}else {
				System.out.println("odd number");
			}
	}

}
