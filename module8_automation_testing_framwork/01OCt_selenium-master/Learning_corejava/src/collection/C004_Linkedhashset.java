package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class C004_Linkedhashset {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("java");
		set.add("android");
		set.add("ios");
		set.add("java");
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
	}
}
