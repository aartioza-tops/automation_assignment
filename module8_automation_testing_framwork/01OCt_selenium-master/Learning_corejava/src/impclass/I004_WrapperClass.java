package impclass;

public class I004_WrapperClass {
	public static void main(String[] args) {
		
		
		int i = 10;
		
		//boxing
		Integer i1 = new Integer(i);
		//autoboxing
		Integer i2 = i;
		
		
		Integer k = 30;
		//unboxing
		int k1 = k.intValue();
		//autounboxing
		int k2 = k;
		
		
		
		int j = 1456396;
		Integer l = j;
		int length =  l.toString().length();
		System.out.println(length);
		
		
		
	}
}
