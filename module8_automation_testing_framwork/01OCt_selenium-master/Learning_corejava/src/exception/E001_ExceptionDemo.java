package exception;

public class E001_ExceptionDemo {
	public static void main(String[] args) {
		
		
		System.out.println("Program started...");
		
		try 
		{
//			int i = 10;
//			int j = i/0;
//			System.out.println(j);
			
			int a[] = new int[10];
			a[11] = 50;

		} 
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Program ended...");
		
	}
}
