// function overloading

package demo;

class Addition{
	
	public
	 	int sum(int a,int b) {
			return a+b;
		}
	
		int sum(int a,int b,int c) {
			return a+b+c;
		}
		
		int sum(int a,int b,int c,int d) {
			return a+b+c+d;
		}
}


public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1 = new Addition();
		System.out.println("sum of two" + a1.sum(10, 10) );
		System.out.println("sum of three" + a1.sum(10, 10,10) );
		System.out.println("sum of four" + a1.sum(10, 10,10,10) );
		
	}

}
