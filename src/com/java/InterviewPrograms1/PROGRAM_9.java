package com.java.InterviewPrograms1;

public class PROGRAM_9
{
	//WAP TO REVERSE WORDS IN A SENTENCE
	public static void main(String[] args)
	{
		String s="We are learning java";
		
		String[] arr=s.split("\\s");
		String result="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			result=result+arr[i]+" ";
		}
		System.out.println(result);
	}

}
