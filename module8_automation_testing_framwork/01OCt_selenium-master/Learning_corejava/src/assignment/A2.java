package assignment;

import java.util.Iterator;

public class A2 {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,50};
		int b[] = new int[a.length];
		
		//System.arraycopy(a, 0, b, 0, 5);
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
	}
}
