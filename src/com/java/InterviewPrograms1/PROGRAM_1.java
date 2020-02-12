package com.java.InterviewPrograms1;

import java.util.HashMap;

public class PROGRAM_1 
{
	//1. WAP TO COUNT WORDS IN A GIVEN STRING (or) REPEATED WORDS IN GIVEN STRING USING HASH MAP
	public static void main(String[] args) 
	{
	  /* String str="I am learning learning java java java programming programming";
	   
	   HashMap<String, Integer> map=new HashMap<String,Integer>();//String is the given words and Integer is the Count Words
	   Integer count=1;
	   String arr[]=str.split(" ");
	   for(int i=0; i<arr.length; i++)
	   {
		   if (!map.containsKey(arr[i]))
		   {
			   map.put(arr[i], count);
			
		}else
		{
			map.put(arr[i],map.get(arr[i])+1);
		}
	   }
	   
	   //Printing the Output
	   for(String s : map.keySet())
	   {
		   System.out.println("THE COUNT OF WORD :"+s+"="+map.get(s));
	   }*/
		
		//Practice
		
		String s="learning java java for testing selenium automation automation";
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		Integer count=1;
		String arr[]=s.split(" ");
		
		for(int i=0; i<arr.length;i++)
		{
			if (!map.containsKey(arr[i]))
			{
			   map.put(arr[i], count);	
			}else
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		
		
		for(String str: map.keySet())
		{
			System.out.println("COUNT WORD :"+str +" = "+map.get(str));
		}
	}

}
