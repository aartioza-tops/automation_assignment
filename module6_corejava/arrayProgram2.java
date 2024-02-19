// W.J.P to create an one dimensional array getting value from user using

package demo;
import java.util.Scanner;
public class arrayProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("\n enter 5 names :");
			String name[] = new String[5];
			Scanner myObj = new Scanner(System.in);
			for(int i=0;i<5;i++) {
				
				name[i] = myObj.nextLine(); 
			}
			
			for(int i=0;i<name.length-1;i++) {
				System.out.println(name[i]);
			}
	}

}
