package com.java.InterviewPrograms1;

public class PROGRAM_8 
{
	//WAP TO CHECK GIVEN STRING IS PALLINDROME or NOT
	public static void main(String[] args) 
	{
	  //TO CHECK GIVEN STRING IS PALLINDROME or NOT, WE HAVE TO TWO WAYS
	  //1. USING RECURSION - MEANS FUNCTION CALLING ITSELF
		
		String s="nitin"; //malayalam
		boolean result=isPallindroneString(s);
		System.out.println(s+" IS PALINDROME ="+result);
		
	  //2. LOGIC FOR SOLVING PROBLEM
		
	}

	public static boolean isPallindroneString(String str)
	{
		if (str==null)
		{
		    return false;	
		}
		
		if (str.length()<=1) 
		{
		    return true;	
		}
		
		String first=str.substring(0,1);
		String last=str.substring(str.length()-1,str.length());
		if (!first.equals(last))
		{
		    return false;	
		} else
		{
          return isPallindroneString(str.substring(1,str.length()-1));
		}	
	}
}
