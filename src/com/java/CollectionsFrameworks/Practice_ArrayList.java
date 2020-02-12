package com.java.CollectionsFrameworks;

import java.util.ArrayList;

public class Practice_ArrayList 
{
	public static void main(String[] args) {
		
	//1. Declare ArrayList
		
		//ArrayList ar =new ArrayList();//we can store all data type values
		//ArrayList<Integer> ar1=new ArrayList<Integer>();// we can store only integer values
		ArrayList<String> ar2=new ArrayList<String>();//we can store only string values
    //2. Add values to the list
		ar2.add("Praveen");
		ar2.add("shaik");
		ar2.add("selenium");
		ar2.add("testing");
		ar2.add("automation");
        
		
    //3. Size of the list
		System.out.println(ar2.size());
		System.out.println("Before Removing elements are "+ar2);
		

	//4. Remove value from list	
		ar2.remove(4);
        System.out.println("After Removing elements are "+ar2);
        System.out.println(ar2.size());
 
	//5. Inserting value to the list
           ar2.add(4,"abc");
           System.out.println("After Inserting elements are "+ar2);
           System.out.println(ar2.size());
           
	//6. Fetch all values from list
           
            for(String s: ar2)
            {
            	System.out.println(s);
            }
		
	}

}
