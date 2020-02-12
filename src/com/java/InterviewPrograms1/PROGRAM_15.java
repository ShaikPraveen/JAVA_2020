package com.java.InterviewPrograms1;

import java.util.HashSet;
import java.util.Set;

public class PROGRAM_15 
{
	//WAP  TO FIND DUPLICATE IN ARRAY USING HASHSET
	public static void main(String[] args) 
	{
		//SET doesn't allow to store duplicates
		int a[]={1,2,3,5,4,5,6,2,4};
		findDuplicatesUsingHashset(a);	
	}

	  private static void findDuplicatesUsingHashset(int arr[])
	  {
		  Set<Integer> hs =new HashSet<Integer>();
		  
		  for(int x : arr)
		  {
			 if (!hs.add(x)) 
			 {
			  System.out.println("DUPLICATE ELEMENT IS "+x);	
			} 
		  }  
	  }
}
