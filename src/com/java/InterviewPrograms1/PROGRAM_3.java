package com.java.InterviewPrograms1;

import java.util.HashMap;

public class PROGRAM_3 
{
	//WAP TO FIND DUPLICATE CHARACTERS IN A GIVEN STRING
	public static void main(String[] args)
	{
	        String str="praveen";
	        char arr[]=str.toCharArray();
	        HashMap<Character, Integer> map=new HashMap<Character,Integer>();
	        int count=1;
	        
	        for(int i=0; i<arr.length; i++)
	        {
	        	if (!map.containsKey(arr[i]))
	        	{
				   map.put(arr[i], count);	
				} else 
				{
                  map.put(arr[i],map.get(arr[i])+1);
				}
	        }
	        
	        
	        //Printing Duplicates
	        for(Character ch : map.keySet())
	        {
	        	if (map.get(ch)>1) 
	        	{
				System.out.println(ch +" :  "+map.get(ch));	
				}
	        }
 	}

}
