package collection;

import java.util.HashSet;

public class C003_Hashset {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("Android");
		set.add("ios");
		set.add("java");
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
	}
}
