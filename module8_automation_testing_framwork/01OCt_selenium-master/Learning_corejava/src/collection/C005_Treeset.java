package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C005_Treeset {
	public static void main(String[] args) {
		
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("android");
		set.add("ios");
		set.add("java");
		
//		for(String s : set)
//		{
//			System.out.println(s);
//		}
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
