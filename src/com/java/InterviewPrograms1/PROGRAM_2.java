package com.java.InterviewPrograms1;

public class PROGRAM_2
{
	//WAP TO COUNT CHRACTER OCCURRENCES IN A GIVEN STRING
	public static void main(String[] args)
	{
		String str="I am learning java programming";
		
	int result=str.length()-str.replaceAll("a", "").length();
	System.out.println("NUMBER OF TIMES CHARACTER OCCURRENCE IS =>"+result);
		
	}

}
