/*
 * 15 - W.J.P. to use of This keyword
 * */
package demo;

public class thisKeyword {

	int x;
	
	void getX(int x) {
		this.x = x;
	}
	
	void putX() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeyword t1 = new thisKeyword();
		t1.getX(50);
		t1.putX();
	}

}
