package com.java.CollectionsFrameworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TC05_Handling_HashSet 
{
	public static void main(String[] args) {
		Set<String> names= new HashSet<String>();
		names.add("Mr.");
		names.add("Praveen");
		names.add("shaik");
		/*names.add("shaik");
		names.add("Praveen"); //It will not print 
		
*/		//HashSet does not guarantee the order, it will print anything
		Iterator<String> it=names.iterator();
		while(it.hasNext())
		{
			System.out.println("Full nmae :: "+it.next()+ it.next()  + it.next());
		}
	}

}
