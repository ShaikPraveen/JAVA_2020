package com.java.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TC02_Handling_BufferedReader 
{
     public static void readDataFromFile(String filepath,String fname) throws IOException
     {
    	 File f=new File(filepath +"\\"+ fname);
    	 FileReader fr=new FileReader(f);
    	 BufferedReader br=new BufferedReader(fr);
    	 String  s= br.readLine();
    	 
    	 while(s!=null)
    	 {
    		 System.out.println(s);
    		 s= br.readLine();
    	 }
     }
     
     public static void main(String[] args) throws IOException 
     {
	    	readDataFromFile("E:\\Praveen_Automation", "File_Handling_Sample.txt");
	}
     
}
