/*
 * 2 - W.j.p. to use of custome Exception 
 * */
package demo;

class myOwnException extends Exception{
	public myOwnException (String str) {
		super(str);
	}
}


public class custome_exception {

	static void methodForCheck(int i) throws myOwnException{
		throw new myOwnException("Error found in code");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			methodForCheck(10);
		} catch (myOwnException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
