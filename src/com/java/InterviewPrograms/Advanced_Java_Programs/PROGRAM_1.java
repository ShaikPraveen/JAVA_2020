package com.java.InterviewPrograms.Advanced_Java_Programs;

public class PROGRAM_1 
{
  //WAP TO PRINT 1 TO 10 NUMBERS WITHOUT USING LOOPS
	public static void main(String[] args)
	{
		printNumbers(1);		
	}

	  public static void printNumbers(int n)
	  {
		 if (n<=10)
		 {
		   System.out.println(n);
		   printNumbers(n+1);
		   
		}  
	  }	  
}
