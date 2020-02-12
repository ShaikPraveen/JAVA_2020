package com.java.CollectionsFrameworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice_HashMap 
{
	public static void main(String[] args) 
	{
		//1. Declare HashMap
		
		Map<Integer, String> hm=new HashMap<Integer,String>();
		
		//2. Add values to the HashMap
		hm.put(10,"praveen");
		hm.put(20, "shaik");
		hm.put(30, "automation");
		System.out.println(hm.size());
		System.out.println(hm);
		//3. Remove value from HashMap
		hm.remove(20);
		System.out.println(hm.size());
		System.out.println(hm);
		
		hm.put(40, "manual");
		
		//4. Read values from HashMap
		
		  for(Map.Entry<Integer,String> en:hm.entrySet())
		  {
			System.out.println(en.getKey()+"="+en.getValue());  
		  }
	}

}
