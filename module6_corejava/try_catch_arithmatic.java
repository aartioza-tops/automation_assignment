package demo;

public class try_catch_arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  
        {  
        int data=50/0; 
        System.out.println("rest of the code");  
        }  
               
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
          
    }  
	

}
