package com.java.Java03_MethodsOrFunctions;

public class TC01_MethodsOrFunctions 
{
	
	public void addition(){
		int a=10;
		int b=20;
		int sumresult=a+b;
		System.out.println(sumresult);
	}
	
	
	
	public int addition1(int a, int b){
		int sumresult=a+b;
		return sumresult;
	}
	
	
	public void subtraction(int a, int b){
		int subresult=a-b;
		System.out.println(subresult);
		
	}
	
	public int subtraction1(int a, int b){
		int subresult=a-b;
		System.out.println(subresult);
		return subresult;
		
	}
	
	//(1+100)*(10-5)
	
	public void multiplication(int a, int b){
		int mulresult=a*b;
		System.out.println(mulresult);
	}
	
}
