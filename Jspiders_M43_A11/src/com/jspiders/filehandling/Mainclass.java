package com.jspiders.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mainclass {
	// create folder/dir
	public static void createFolder(String path, String name) {
		File f1 = new File(path + name);

		if (f1.exists() != true) {
			f1.mkdir();
			System.out.println(name + " folder created");
		} else {
			System.out.println("folder with " + name + " already exist in the path");
		}
	}

	// create file
	public static void createFile(String path, String fileName) throws IOException {
		File f1 = new File(path + fileName);

		if (f1.exists() != true) {
			f1.createNewFile();// Unhandled exception type IOException
			System.out.println(fileName + " file created");
		} else {
			System.out.println("file with " + fileName + " already exist in the path");
		}
	}

	// File writting
	public static void writeToFile(String path, String fileName, String data) throws IOException {
		File f1 = new File(path + fileName);

		FileWriter fw = new FileWriter(f1);

		fw.write(data);
		fw.flush();

		fw.close();

		System.out.println("file writting complete");

	}

	// File Reading
	public static String readFromFile(String path, String fileName) throws IOException 
	{
		File f1 = new File(path + fileName);
		FileReader fr = new FileReader(f1);
		StringBuffer sb1 = new StringBuffer();
		String data = "";
		
		long len = f1.length();
		
		for(int i=1; i<=len; i++)
		{
		  int i1 = fr.read();
		  char c1 = (char)i1;
	      sb1 = sb1.append(c1);
		}
		
		data = sb1.toString();
		
		fr.close();
		
       return data;

	}

	public static void main(String[] args) {
		System.out.println("Program starts...");

		String path = "/Users/Madhu/Documents/BECM43/";
		String folder = "DEMO";
		String fileName = "Test.txt";
		// createFolder(path,"DEMO");

		try 
		{
			//createFile(path + folder + "/", fileName);

			//writeToFile(path + folder + "/", fileName, "THIS IS FILE HANDLING CLASS");

			String res = readFromFile(path+folder+"/",fileName);
			System.out.println(res);
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Program ends...");
	}

}
