package com.java.OOPS.Inheritance;

public class TC01_ClassC
{
	public static void main(String[] args) {
		
		TC01_ClassB obj=new TC01_ClassB();
		            obj.sum(10, 30);
		            obj.sub(20, 10);
		            obj.mul(10, 20);
		
		TC01_ClassA obj1=new TC01_ClassA();
		            obj1.sum(10, 20);
		            obj1.sub(20, 50);
		            
		            
   //Rules:- 1. In Child Class Object we can access only parent class methods and variables
  //	     2. In Parent class object we can not access child class methods and variables
 //          3. The relationship between super class and sub class is called IS-A Relationship
		
 //Advantages :  1. Overriding is possible  2.Reduce duplicate Data 3. Easy of Code
		            
 //Types Of Inheritance:-
		          /*1. Single Inheritance        - Directly Supported
		            2. Multilevel Inheritance    - Directly Supported
		            3. Hierarchical              - Directly Supported
		            4. Multiple                  - Not Directly Supported  - Using Interface we can acheive
		            5. Hybrid                    - Not Directly Supported  - Using Interface we can acheive
*/
		    	        	            
	}

}
