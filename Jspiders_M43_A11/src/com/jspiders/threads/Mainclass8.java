package com.jspiders.threads;

public class Mainclass8 {
	static String str1 = new String("hello");

	public static void main(String[] args) {

		Runnable task1 = () -> 
		{
			synchronized(str1) 
			{
				str1 = str1.concat("world");
				System.out.println(str1);
			}
			
		};

		Runnable task2 = () -> 
		{
			synchronized(str1) 
			{
			  str1 = str1.concat("java");
			  System.out.println(str1);
			}
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

	}
}
