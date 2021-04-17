package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");

		Runnable task = () -> 
		{
			System.out.println("thread task executed");
		};
		
		ExecutorService ftp = Executors.newFixedThreadPool(4);
		
		for(int i=1; i<=10; i++)
		{
		  ftp.submit(task);
		}
		
		ftp.shutdown();
		
		System.out.println("Main ends...");
	}
}




