package collection;

import java.util.ArrayList;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		//default size : 10
		//new size = oldsize * 3/2  + 1
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		//al.add(2,50);
		//al.set(1, 60);
		//al.remove(2);
		
		//System.out.println(al.size());
		System.out.println(al.get(1));
		
//		for(int i :al)
//		{
//			System.out.println(i);
//		}
//		
	}
}
