/*
 * 4 - W.j.p. to count the word from the string
 * */
package demo;
import java.util.*;
public class count_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		int count=0;
		
		System.out.println("Enter the string :");
		
		Scanner scan=new Scanner(System.in);  
		s1 = scan.next();
		
		for(int i = 0;i<=s1.length()-1;i++) {
			System.out.println("s1.charAt(i) " + s1.charAt(i));
//			if(s1.charAt(i) == ' ') {
//				count++;
//			}
		}
		
	//	System.out.println("Total words" + count);
	}

}
