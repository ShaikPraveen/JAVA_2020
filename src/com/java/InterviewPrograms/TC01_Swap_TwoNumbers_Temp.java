package com.java.InterviewPrograms;

public class TC01_Swap_TwoNumbers_Temp {
	// WAP TO SWAP TO NUMBERS USING THIRD VARIABLE
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int temp;

		System.out.println("BEFORE SWAPPING THE VALUE OF A IS  " + a);
		System.out.println("BEFORE SWAPPING THE VALUE OF B IS  " + b);

		temp = a;// 10
		a = b;// 30
		b = temp;// 10

		System.out.println("AFTER SWAPPING THE VALUE OF A IS   " + a);
		System.out.println("AFTER SWAPPING THE VALUE OF B IS   " + b);
	}

}
