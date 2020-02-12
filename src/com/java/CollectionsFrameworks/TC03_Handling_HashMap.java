package com.java.CollectionsFrameworks;

import java.util.HashMap;
import java.util.Map;

public class TC03_Handling_HashMap 
{
	//HashMap Follows KEY and VALUE format
	// KEYS ARE UNIQUE and VALUES are Duplicate
	
	
	public static void main(String[] args) 
	{
		//1. Declare HashMap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//2. Add elements to HashMap
		      hm.put(100,"praveen");
		      hm.put(101, "venkat");
		      hm.put(102, "basha");
		      hm.put(103, "suleman");
		      hm.put(104, "ramu");
		  System.out.println(hm);
		  System.out.println(hm.size());//5
		
		//3. Remove elements from HashMap
		  hm.remove(103);
		  System.out.println("After removing pair is "+hm);
		  System.out.println(hm.size());
		  
		//4. Read pairs from HashMap using for loop
		  
		  //Note: If you want to read data from HashMap, it will provide entrySet() Method, the return type if Map.Entry
		  // If you want to read key it will provide getKey() and If you want to read value will provide getValue() Methods
	             for(Map.Entry m:hm.entrySet())
	             {
	            	  System.out.println(m.getKey()+" "+m.getValue());
	            	  
	             } 
	             
	       //Note :- We will use this HashMap in Data Driven Framework like Multiple usernames and Passwords like
	       //Key and Value Format
	}

}
