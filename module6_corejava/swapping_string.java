/*
 * 2 - W.J.P. to Swap the String
 * */
package demo;
import java.util.*;
public class swapping_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3;
		
		System.out.println("Enter 2 string :");
		
		Scanner scan=new Scanner(System.in);  
		s1 = scan.next();
		s2 = scan.next();
		
		System.out.println("before swapping : " + "s1 = " + s1 + " s2 =" + s2 );
		
		s3 = s1;
		s1 = s2;
		s2 = s3;
		
		System.out.println("after swapping : " + "s1 = " + s1 + " s2 =" + s2 );
		
	}

}
