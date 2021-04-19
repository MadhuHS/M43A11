package com.jspiders.threads;

public class Mainclass9 {
	static String s1 = new String("hello");
	static String s2 = new String("hello");

	public static void main(String[] args) {

		Runnable task1 = () -> 
		{
			System.out.println("t1 starts...");
			
			System.out.println("t1 waiting to lock s1");
			synchronized(s1) 
			{
				System.out.println("t1 locked s1");
				
				System.out.println("t1 waiting to lock s2");
				
				try 
				{
					System.out.println("t1 going to wait state");
					s1.wait(3000);
					System.out.println("t1 came back to execution state");

				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
				
				synchronized(s2) 
				{
					System.out.println("t1 locked s2");
					
					System.out.println("t1 unlocked s2");
				}
				
				System.out.println("t1 unlocked s1");
			}
			
			System.out.println("t1 ends...");
			
		};
		
		Runnable task2 = () -> 
		{
			System.out.println("t2 starts");
			
			System.out.println("t2 waiting to lock s2");
			
			synchronized(s2) 
			{
				System.out.println("t2 locked s2");
				
				System.out.println("t2 waiting to lock s1");
				synchronized(s1) 
				{
					System.out.println("t2 locked s1");	
					System.out.println("t2 unlocked s1");
					s1.notify();
				}
				
				System.out.println("t2 unlock s2");
			}	
			
			System.out.println("t2 ends");

			
		};


		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

	}
}
