package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> technologies = new ArrayList<String>();
		
		technologies.add("Angular");
		technologies.add("ios");
		technologies.add(".net");
		technologies.add("Automation");
		
		System.out.println(technologies);
		
		technologies.forEach((n)->
		System.out.println(n));
		
		// size of list
		System.out.println("size of list" + technologies.size());
		
		System.out.println(technologies.get(2));
		
		Iterator itr = technologies.iterator();
		
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println("Ele : "+obj);
		}
	
		System.out.println("Reverse Order");
		
//		while(itr.hasPrevious())
//		{
//			Object obj=itr.previous();
//			System.out.println("Ele : "+obj);
//		}
		
		
	}

}
