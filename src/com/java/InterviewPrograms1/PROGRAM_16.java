package com.java.InterviewPrograms1;

import java.util.HashMap;
import java.util.Map;

public class PROGRAM_16 
{
	//WAP TO FIND DUPLICATE IN ARRAY USING HASHMAP
	public static void main(String[] args)
	{
		int a[]={2,5,6,2,11,6,7,5,11};
		findDuplicateUsingHashmap(a);
	}
	

	 private static void findDuplicateUsingHashmap(int arr[])
	 {
		 Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		 
		 for(int x : arr)
		 {
			 if (!map.containsKey(x))
			 {
			     map.put(x, 1);	
			}else
			{
				map.put(x, map.get(x)+1);
			}
		 }
		 
		 
		 for(Integer x : map.keySet())
		 {
			 if (map.get(x)>1) 
			 {
			   System.out.println("DUPLICATE ELEMENT IS "+x);	
			}
		 }
	 }
}
