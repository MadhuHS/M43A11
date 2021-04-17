package com.jspiders.threads;

class Sample {

}

class ThreadTaskOne extends Sample implements Runnable 
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

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		ThreadTaskOne t1 = new ThreadTaskOne();
		
		Thread th1 = new Thread(t1);
		th1.start();
		
		System.out.println("Main ends...");

	}
}






