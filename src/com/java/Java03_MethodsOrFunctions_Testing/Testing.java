package com.java.Java03_MethodsOrFunctions_Testing;

import com.java.Java03_MethodsOrFunctions.TC01_MethodsOrFunctions;

public class Testing 
{
	public static void main(String[] args) {
		TC01_MethodsOrFunctions tc=new TC01_MethodsOrFunctions();
		
		int result1,result2;
		//tc.addition();
		//tc.addition1(10, 80);
		//result=tc.addition1(20, 50);
		//tc.subtraction(result, 30);
		result1=tc.addition1(1, 100);
		result2=tc.subtraction1(10, 5);
		tc.multiplication(result1, result2);
	}

}
