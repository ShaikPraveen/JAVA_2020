package com.java.InterviewPrograms1;

public class PROGRAM_10
{
	//HOW TO REVERSE EACH WORDS IN THE SENTENCE
	public static void main(String[] args)
	{
		String s="How are you";
		String arr[] =s.split("\\s");
		String result="";
		
		for(String word : arr)
		{
			String reverseword="";
			int j=word.length();
			while(j>0)
			{
				char ch=word.charAt(j-1);
				reverseword=reverseword+ch;
				j--;
			}
			result=result+reverseword+" ";
		}
		
		System.out.println(result);
	}

}
