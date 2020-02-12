package com.java.ReadData;

import java.util.Scanner;

public class ReadData 
{
	public static void main(String[] args) {
		
		//Ask user to enter Name
		System.out.println("PLEASE ENTER YOUR NAME HERE");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		
		System.out.println("PLEASE ENTER YOUR MARKS");
		String marks=sc.nextLine();
		int m=Integer.parseInt(marks);//Integet to String format
		System.out.println(m+50);
	}
}
