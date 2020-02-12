package com.java.InterviewPrograms1;

public class PROGRAM_13
{
	//WAP TO FIND DUPLICATES ELEMENTS IN GIVEN ARRAY USING BRUTE FORCE METHOD
	public static void main(String[] args)
	{
		int arr[]={2,3,5,6,5};
		PROGRAM_13.findDuplicateUsingBruteForce(arr);
	}
	
	
	private static void findDuplicateUsingBruteForce(int[] arr)
	{
		 for (int i = 0; i < arr.length; i++) 
		 {
			 for (int j = i+1; j < arr.length; j++)
			 {
				 if (arr[i]==arr[j])
				 {
				    System.out.println("DUPLICATE ELEMENT FOUND "+arr[i]);	
				}
			}	
		}	
	}

}
