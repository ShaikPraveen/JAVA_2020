package com.java.CollectionsFrameworks;

import java.util.ArrayList;

public class TC02_Handling_ArrayList_AllDataTypeValues 
{
	// When we will go for Arraylist
	//There are two situations one is 1. If you dont know the size of the arraylist
	                                //2. If you have different type of elements
	
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);
		ar.add("praveen");
		ar.add(1120.12);
		ar.add('A');
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println(ar);
		
		ar.remove(2);
		System.out.println("After Removing elements are "+ar.size());
		System.out.println(ar);
		
		ar.add(1,"Automation");
		System.out.println("After Inserting element "+ar.size());
		System.out.println(ar);
		
		for(Object obj : ar)  //Object type variable can hold any type of values
		{
			System.out.println(obj);
		}
		
	}

}
