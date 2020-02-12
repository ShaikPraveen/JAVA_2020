package com.java.InterviewPrograms1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PROGRAM_5 
{
	//WAP TO FIND FIRST NON REPEATED CHARACTER IN A GIVEN STRING
	public static void main(String[] args)
	{
	  String s="programming";
	  
	  Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
	 //LinkedHashmap maintains insertion order
	  int count =1;
	  
	     for(int i=0; i<s.length(); i++)
	     {
	    	 if (!map.containsKey(s.charAt(i)))
	    	 {
	    		 map.put(s.charAt(i), count);
				
			}else
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
	     }
	     
	     
	     for (Entry<Character, Integer> en : map.entrySet())
	     {
		   if (en.getValue()==1) 
		   {
			  System.out.println("THE FIRST NON REPEATED CHARACTER IS "+en.getKey());
		      break;
		   }	
		}
	}

}
