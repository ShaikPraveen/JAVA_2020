package com.java.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TC03_Handling_FileWriter 
{
	public static void writeDataToFile(String filepath,String fname,String data) throws IOException
	{
		File f=new File(filepath+"\\"+fname);
		FileWriter fw=new FileWriter(f,true);//Here while using true and run 
		                                     //the program three times it will print data same data in single line
		                                     //true means this append mode
		fw.write(data);
		fw.flush();
		fw.close();
	}
	
	public static void main(String[] args) throws IOException {
	writeDataToFile("E:\\Praveen_Automation", "File_Handling_Sample123.txt", "0045.SELENIUMm TESTER");
	System.out.println("FILE CREATED AND WRITTEN");	
	}
}
