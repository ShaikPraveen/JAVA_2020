package com.java.InterviewPrograms.Advanced_Java_Programs;

public class PATTEREN_3
{
	//WAP TO PRINT FOLLOWING FORMAT
    /*  1
        1 2
        1 2 3
        1 2 3 4
        1 2 2 4 5
    */
	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
