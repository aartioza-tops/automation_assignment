class value{
	int a,b;
	void get_value(int x,int y) {
		a=x;
		b=y;
	}
	int add() {
		return a+b;
	}
	int mul() {
		return a*b;
	}
}
public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		value v1 = new value();
		v1.get_value(10, 10);
		
		System.out.println("sum is "+ v1.add());
	}

}
