package demo;

class A{
	
	public
		void myFunc() {
		System.out.println("Class A");
	}
}

class B extends A{
	public
	void myFunc() {
		System.out.println("Class B");
}
}


public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.myFunc();
	}

}
