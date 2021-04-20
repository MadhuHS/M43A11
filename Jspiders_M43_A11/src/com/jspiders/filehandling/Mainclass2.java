package com.jspiders.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Mainclass2 {
	public static void createPropFile() 
	{
		String path = "/Users/Madhu/Documents/BECM43/";
		String folder = "DEMO";
		String fileName = "Test";
		
		Properties p1 = new Properties();

		p1.put("Key1", "abcd");
		p1.put("Key2", "pqrs");
		p1.put("Key3", "wxyz");

		try 
		{
			FileOutputStream fos = new FileOutputStream(path + folder + "/" + fileName);

			p1.store(fos, "this is properties file");

			System.out.println("file created");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public static void readPropFile()
	{
		String path = "/Users/Madhu/Documents/BECM43/";
		String folder = "DEMO";
		String fileName = "Test";
		
		Properties p1 = new Properties();
		
		try
		{
		  FileInputStream fis = new FileInputStream(path+folder+"/"+fileName);
		  p1.load(fis);
		  
		  System.out.println(p1.get("Key1"));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		//createPropFile();
		readPropFile();
	}
}





