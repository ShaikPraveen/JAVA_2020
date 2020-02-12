package com.java.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TC01_Handling_FileReader
{
	
	 public static void readDataFromFile(String filepath, String filename) throws IOException
	 {
		 File f=new File("E:\\Praveen_Automation\\File_Handling_Sample.txt");
		 FileReader fr=new FileReader(f);
		 int i=fr.read();//It will read only one character at a time
		 
		 while(i!=-1) //Why i am using this i am not sure, howmay characters are there in Textfile
		 {
			// System.out.println(i);//It will print new value and sky format
			 System.out.print((char)i);
			 i=fr.read();//It will print next value
		 }
		 
	 }
	 
	 public static void main(String[] args) throws IOException
	 {
		 readDataFromFile("ABC", "xyz");//You can pass any name here instead of abc and xyz
	}
	

}
