package oops;

abstract class Abs
{
	public abstract void display();
	
	public void show()
	{
		System.out.println("Runing show method...");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		
		System.out.println("abs display running...");
	}
	
}

public class O001_AbstractDemo {
	public static void main(String[] args) {
		
		//Abs ab = new Abs();
		AbsImpl impls = new AbsImpl();
		impls.display();
		impls.show();
	}
}
