package com.jspiders.exceptionhandling;

public class Mainclass3 {

	public static int test(int num)throws ArithmeticException {
		System.out.println("test() starts...");

		int res = 50 / num;

		System.out.println("test() ends..");

		return res;
	}
	
	public static void test2(int num) throws InterruptedException
	{
		System.out.println("test() starts...");

		Thread.sleep(num);

		System.out.println("test() ends..");

	}

	public static void main(String[] args) {
		System.out.println("main() starts...");

		try 
		{
			int r1 = test(0);
			System.out.println(r1);
		} 
		catch (ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		try 
		{
			test2(10000);
		} 
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}

		System.out.println("main() ends..");
	}

}
