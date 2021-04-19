package com.jspiders.threads;

class Counter
{
	private int v1 = 0;
	
	synchronized public void increment()
	{
		v1++;
	}
	
	synchronized public void decrement()
	{
		v1--;
	}
	
	synchronized public void showValue()
	{
		System.out.println("v1 : "+v1);
	}
}


public class Mainclass7 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		
		Counter c1 = new Counter();

		Runnable task1 = () -> 
		{
			c1.increment();
			c1.showValue();
		};
		
		Runnable task2 = () -> 
		{
			c1.decrement();
			c1.showValue();
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		
		

		System.out.println("Main ends...");
	}
}




