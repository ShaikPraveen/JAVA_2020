package com.java.InterviewPrograms1;

public class PROGRAM_6
{
	//WAP TO REVERSE A STRING
	public static void main(String[] args)
	{
		String s="selenium";
		//IF YOU WANT TO REVERSE A STRING WE HAVE TWO METHODS
		//1. USING STRING BUFFER CLASS
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse().toString());
		
		
		//2. WITHOUT STRING BUFFER
		String res="";
		for(int i=s.length()-1; i>=0;i--)
		{
		     res=res+s.charAt(i);
		}
		System.out.println(res);
	}
}
