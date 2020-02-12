package com.java.InterviewPrograms1;

public class PROGRAM_7 
{
	// HOW TO USE Substring() METHOD IN JAVA
	public static void main(String[] args) 
	{
	   
		String s="www.erostrum.com";
		//www. --->First Four Characters
		//.com --->Last Four Characters
		
		//note: begining idex is inclusive
		//      ending index is exclusive
		String firstFour=s.substring(0, 4);
		System.out.println(firstFour);
		
		String lastFour=s.substring(s.length()-4, s.length());
		System.out.println(lastFour);
		
		
	   String website=s.substring(4,s.length()-4);
	   System.out.println(website);
		
		
	}

}
