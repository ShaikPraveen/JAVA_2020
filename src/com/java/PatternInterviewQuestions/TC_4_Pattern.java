package com.java.PatternInterviewQuestions;

public class TC_4_Pattern 
{
	
 /*	A A A A A
	B B B B B
	C C C C C
	D D D D D 
	E E E E E
	
*/
	public static void main(String[] args) 
	{
	    char i;
	    char j;
	    
	    for(i='A';i<='E';i++)
	    {
	    	for(j='A';j<='E';j++)
	    	{
	    		System.out.print("A");
	    	}
	    	System.out.println();
	    }
	}

}
