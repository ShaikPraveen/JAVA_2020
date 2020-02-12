package com.java.InterviewPrograms1;

import java.util.Arrays;

public class PROGRAM_11
{
	//WAP TO FIND LARGEST AND SMALLEST EMEMENT IN A GIVEN ARRAY
	public static void main(String[] args) {
		
		int arr[]={5,8,11,15,20,35,50,64,-100,-120,-0};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		
		for (int i = 1; i < arr.length; i++) 
		{ 
			if (arr[i]>largest)
			{
				largest=arr[i];
				
			} else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("THE LARGEST NUMBER IS "+largest);
		System.out.println("THE SMALLEST NUMBER IS "+smallest);
	}

}
