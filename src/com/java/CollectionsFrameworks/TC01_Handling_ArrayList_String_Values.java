package com.java.CollectionsFrameworks;

import java.util.ArrayList;

public class TC01_Handling_ArrayList_String_Values
{
	public static void main(String[] args) {
		
   //1.How to declare Arraylist		
	  //ArrayList list=new ArrayList(); //we can store any type of elements	
	  //ArrayList<Integer> ai=new ArrayList<Integer>(); //This arraylist stores only Integer values. Here Integer is a Class
	  ArrayList<String> ar=new ArrayList<String>(); //This arraylist stores only string values. Here String is a Class 
	      	
   //2. Adding values to the list
	      
	       ar.add("praveen"); //0
	       ar.add("automation");//1
	       ar.add("testing");//2
	       ar.add("selenium");//3
	       
  //3. Find size of the Arraylist
	       System.out.println(ar.size()); //4
	       System.out.println("Before removing the elements are "+ar); //printing values
	       
  // 4. Remove specific element from ArrayList
	       ar.remove(3);
	       System.out.println(ar.size());
	       System.out.println("After removing the elements are "+ar);
	       
  // 5. Inserting a new element into Arraylist
	       ar.add(1,"shaik");
	       System.out.println(ar.size());
	       System.out.println("After inserting an element "+ar);
	       
 // 6. Read Vaues from ArrayList using for loop
	       for(String s:ar)
	       {
	    	   System.out.println(s);
	       }
	}

}
