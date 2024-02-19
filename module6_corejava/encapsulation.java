package demo;

class myClass{
	private
		int rollno;
		String name;
		
	public
		void get(int r,String n) {
			rollno = r;
			name = n;
		}
	
		void printData() {
			System.out.println("Rollno : " + rollno + "  Name :" + name);
		}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			myClass m1 = new myClass();
			m1.get(10, "Aarti");
			m1.printData();
	}

}
