
/*
 * 13 - W.J.P. to use of abstract class and method
 * */
package demo;

abstract class Vehicle{
	protected abstract void start();
    protected abstract void stop();
   
}

class Car extends Vehicle{

	@Override
	protected void start() {
		System.out.println("car started");
		
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("car stopped");
	}

	void drive() {
		
		System.out.println("car drivi in");
	}

	void changeGear() {
		System.out.println("car gear changed");
		
	}

	void reverse() {
		System.out.println("car reverse");
		
	}

	
	
}

public class abstractClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car();
		bmw.start();
		bmw.stop();
		bmw.drive();
		bmw.changeGear();
		bmw.reverse();
	}

}
