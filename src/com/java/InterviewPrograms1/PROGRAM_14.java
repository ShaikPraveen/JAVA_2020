package com.java.InterviewPrograms1;

import java.util.Arrays;

public class PROGRAM_14 
{
	//WAP TO FIND DUPLICATE IN ARRAY USING SORTING
	public static void main(String[] args)
	{
		int arr[]={2,3,4,5,6,7,5,2};
		findDuplicatesUsingSorting(arr);	
	}
	
	
	private static void findDuplicatesUsingSorting(int arr[])
	{
	    Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) 
		{
			 if (arr[i]==arr[i+1])
			 {
				 System.out.println("DUPLICATE ELEMENT IS "+arr[i]);
				
			}
		}
		
	}

}
