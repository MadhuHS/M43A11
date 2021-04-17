package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AppServer
{
	public static void login()
	{
	  System.out.println("login() executed");
	}
}

public class Mainclass5 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");

		Runnable task = () -> 
		{
			AppServer.login();
		};
		
		ExecutorService ctp = Executors.newCachedThreadPool();
		
		for(int i=1; i<=10; i++)
		{
		  ctp.submit(task);
		}
		
		
		System.out.println("Main ends...");
	}
}




