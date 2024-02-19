package demo;

class myClass123{
	static int count=0;
	
	void increment() {
		count++;
	}
	
	void printCount() {
		System.out.println(count);
	}
}


public class staticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass123 m1 = new myClass123();
		m1.increment(); 
		m1.printCount(); // count = 1
		myClass123.count++; 
		m1.printCount(); // count = 2 
		
	}

}
