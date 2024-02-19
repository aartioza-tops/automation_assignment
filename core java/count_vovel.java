/*
 *  5 - W.J.P. to count the vovel from the string
 * */
package demo;
import java.util.*;
public class count_vovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_vovel = 0;
		String s1;
		
		System.out.println("enter your string :");
		Scanner scan = new Scanner(System.in);
		s1 = scan.next();
		
		for(int i = 0;i<s1.length(); i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'|| s1.charAt(i) == 'u'  )
			{
				total_vovel++;
			}
		}
		
		System.out.println("Total vovel" + total_vovel);
		
	}

}
