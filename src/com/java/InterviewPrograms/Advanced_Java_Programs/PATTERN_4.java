package com.java.InterviewPrograms.Advanced_Java_Programs;

public class PATTERN_4 
{
	//WAP TO PRINT FOLLOWING FORMAT
    /*  * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
    */
	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
