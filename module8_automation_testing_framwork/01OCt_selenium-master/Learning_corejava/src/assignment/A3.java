package assignment;

public class A3 {
	public static void main(String[] args) {
		
			
			int a[] = {10,20,30,40,50,60};
			int b[] = new int[a.length];
			
			int count = 0;
			for(int i=a.length-1;i>=0;i--)
			{
				b[count] = a[i];
				count++;
				
			//	System.out.println(a[i]);
			}
			
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		
		
	}
}
