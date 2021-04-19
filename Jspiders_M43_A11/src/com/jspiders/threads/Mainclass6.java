package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Mainclass6 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");

		Runnable task = () -> 
		{
			System.out.println("executing task");
		};
		
		ScheduledExecutorService stp = Executors.newScheduledThreadPool(4);
		
		stp.schedule(task,3,TimeUnit.SECONDS);
		
		stp.scheduleAtFixedRate(task,2,3,TimeUnit.SECONDS);
		
		stp.shutdown();
		
		ExecutorService ste = Executors.newSingleThreadExecutor();
		
		for(int i=1;i<=10;i++)
		{
		 ste.submit(task);
		}
		

		System.out.println("Main ends...");
	}
}




