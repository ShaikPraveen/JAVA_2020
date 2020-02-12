package com.java.Array;

public class Handling_TwoDimentional_Array 
{
	public static void main(String[] args) {
		
		int array[][]={
				      {11,22,33,44},
				      {22,44,66,88}};
		//Here we have two rows and four columns
		
		System.out.println(array.length);//2 is rows
		System.out.println(array[0][2]);
		
		
		for(int i=0; i<2;i++) //Two means 2 rows will start
		{
			for(int j=0; j<4;j++) //Four means 4columns will start
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
