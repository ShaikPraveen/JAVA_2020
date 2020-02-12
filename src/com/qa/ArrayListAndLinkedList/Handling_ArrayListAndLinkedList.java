package com.qa.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Handling_ArrayListAndLinkedList 
{
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		System.out.println(list);
		System.out.println(list1);
	}

}
