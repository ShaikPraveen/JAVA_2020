package com.java.BreakAndContinue;

public class ContinueAndBreak 
{
	public static void main(String[] args) 
	{
		/*//1.Continue
		//I dont want to print 5	
		for (int i = 1; i<=10; i++) 
		{
			 if(i==5) // 5 will not print
			 {
				 continue;
			 }
		    System.out.println(i);	
		}*/
		
		
		
		
		//2. Break
		//I want to print only 1 to 5
		
		 for(int i=1; i<=10;i++)
		 {
			 if(i>5)
			 {
				 break;
				 
			 }
			 System.out.println(i);
		 }
	}

}
