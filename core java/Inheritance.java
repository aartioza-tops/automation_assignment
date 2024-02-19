package demo;

class Student{
	protected
		int rollno;
		String name;
	
	public
		void get(int r,String n) {
			rollno = r;
			name = n;
		}

		
}

class Sport extends Student{
	
	protected
		int spmk;
	
	public
		void get(int s) {
		spmk = s;
		}
	
	
}

class Result extends Sport{
	
	
	public
	void printData() {
		System.out.println("Rollno : " + rollno + "  Name :" + name + " Sport Mark :" + spmk  );
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result s1 = new Result();
		s1.get(20, "Tops");
		s1.get(50);
		
		s1.printData();
	}

}
