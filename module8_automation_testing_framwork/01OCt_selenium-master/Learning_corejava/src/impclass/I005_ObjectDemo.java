package impclass;

class A
{
	int i = 50;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
class B extends A
{
	
}

public class I005_ObjectDemo {
	public static void main(String[] args) {
		
		
		A a = new A();
		System.out.println(a);
	}
}
