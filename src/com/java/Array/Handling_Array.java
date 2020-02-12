package com.java.Array;

public class Handling_Array
{
	public static void main(String[] args) {
		//Declare an Array
		
		int array[]={10,20,30,40,50};
		
		//1.Length
		System.out.println(array.length);
		
		//2. Fetch any value from array
		System.out.println(array[2]);
		
		//3. Update the value
		array[4]=60;
		System.out.println(array[4]);
		
		//4. Fetch all data
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("====================");
		
		//Another  Approach
		
		 int a[]=new int[5];
		 a[0]=10;
		 a[1]=20;
		 a[2]=40;
		 a[3]=50;
		 a[4]=60;
		 
		 System.out.println(a[2]);
		 System.out.println(a[3]);//0 why because we can not declare the value
		 System.out.println(a.length);
		 for(int i=0; i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	}

}
