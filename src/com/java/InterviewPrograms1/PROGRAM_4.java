package com.java.InterviewPrograms1;

import java.util.Arrays;

public class PROGRAM_4 
{
	//CHECK TWO STRINGS ARE ANAGRM STRINGS OR NOT
	
	/*
      ANGRAM STRINGS MEANS :- SAME CHARACTERS AND SAME LENGTH OF STRING CHARACTERS	 
*/
	public static void main(String[] args)
	{
		String str="bat";
		String str1="tab";
		
		char arr1[]=str.toLowerCase().toCharArray();
		char arr2[]=str1.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2))
		{
		    System.out.println("GIVEN STRINGS ARE ANAGRAM STRINGS");	
		}else
		{
			System.out.println("GIVEN STRINGS ARE NOT ANGRAM STRINGS");
		}	
	}
}
