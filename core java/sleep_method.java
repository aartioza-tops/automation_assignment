/*
 * 1 - W.J.P. to use Sleep method in Thread
 * */
package demo;

public class sleep_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            for (int i = 0; i < 5; i++) {
	               
	                Thread.sleep(1000);
	               
	                // printing the value of the variable
	                System.out.println(i);
	            }
	        }
	        catch (Exception e) {
	           
	            // catching the exception
	            System.out.println(e);
	        }
	}

}
