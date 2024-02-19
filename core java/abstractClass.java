package demo;

interface myInterFace{
	void myFunction();
}

class firstClass implements myInterFace{
	
	public void myFunction() {
		System.out.println("my interface from first class");
		
	}
}

class secondClass implements myInterFace{
	public void myFunction() {
		System.out.println("my interface from second class");
	}
}

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstClass f1 = new firstClass();
		f1.myFunction();
		
		secondClass s1 = new secondClass();
		s1.myFunction();
	}

}
