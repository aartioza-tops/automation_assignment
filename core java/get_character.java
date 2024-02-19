
/*
 * 1 - W.J.P. to get the character at the given index within the String. 
 * Original String = Tops Technologies!
 * */
package demo;
import java.util.*; 
public class get_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name = "Tops Technologies!";
			
			System.out.println("Enter your index number");
			Scanner scan=new Scanner(System.in);  
			int x=scan.nextInt(); 
			
			
			
			System.out.println(name.charAt(x));
			
	}

}
