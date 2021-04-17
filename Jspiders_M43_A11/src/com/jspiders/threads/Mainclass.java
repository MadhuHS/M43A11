package com.jspiders.threads;

class ThreadOne extends Thread 
{
	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println("Task one executing");
		}
	}
}

class ThreadTwo extends Thread 
{
	@Override
	public void run() 
	{
		for (int j = 1; j <= 3; j++) 
		{
			System.out.println("Task two executing");
		}
	}
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.start();
		t2.start();

		System.out.println("Main ends...");
	}
}





