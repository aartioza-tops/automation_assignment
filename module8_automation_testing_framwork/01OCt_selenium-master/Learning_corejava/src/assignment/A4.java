package assignment;

public class A4 {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,3,99,4,6,99,5,98};
		
		int max = a[0]; //10 20 99
		int smax = a[0]; //10 10 20
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
			{
				smax = max;
				max = a[i];
			}
			else if(a[i]>smax || smax == max)
			{
				smax = a[i];
			}
		}
		
		System.out.println("max : "+max);
		System.out.println("smax : "+smax);
	}
}
