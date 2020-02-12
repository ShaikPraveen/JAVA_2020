package com.java.CollectionsFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class TC04_Handling_Iterator 
{
	//Video Link :: https://www.youtube.com/watch?v=f8vWVcsjRxE
	public static void main(String[] args)
	{
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		//getting iterator form Arraylist to traverse elements 
		
		Iterator<Integer> it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
