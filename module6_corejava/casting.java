package demo;

public class casting {

	public static void main(String[] args) {
		
		// implicit typecasting, the conversion involves a smaller data type to the larger type size
		
		  byte p = 12;  
	      System.out.println("byte value : "+p);  
	     
	      short q = p;  
	      System.out.println("short value : "+q);  
	      
	      int r = q;  
	      System.out.println("int value : "+r);  
	      
	      long s = r;  
	      System.out.println("long value : "+s);  
	      
	      float t = s;  
	      System.out.println("float value : "+t); 
	      
	      double u = t;  
	      System.out.println("double value : "+u); 
	      
	      // conversion of a larger data type into a lower one.
	      
	     double d = 166.66;  
	    //converting double data type into long data type  
	    long l = (long)d;  
	    //converting long data type into int data type  
	    int i = (int)l;  
	    System.out.println("Before conversion: "+d);  
	    //fractional part lost  
	    System.out.println("After conversion into long type: "+l);  
	    //fractional part lost  
	    System.out.println("After conversion into int type: "+i); 
	      
	}

}
