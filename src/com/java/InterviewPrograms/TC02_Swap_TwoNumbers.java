package com.java.InterviewPrograms;

public class TC02_Swap_TwoNumbers{
	// WAP TO SWAP TWO NUMBERS WITHOUT USING THIRD VARIABLE

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("BEFORE SWAPPING THE VALUE OF A IS  " + a);
		System.out.println("BEFORE SWAPPING THE VALUE OF B IS  " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("AFTER SWAPPING THE VALUE OF A IS   " + a);
		System.out.println("AFTER SWAPPING THE VALUE OF B IS   " + b);
	}

}
