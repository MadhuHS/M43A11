package com.jspiders.exceptionhandling;

public class Mainclass2 {

	public static void test(int num)
	{
		System.out.println("test() starts...");
        int[] a1 = {10,20,30,40};
		try 
		{
			int res = 50 / num;
			System.out.println("res : " + res);
			System.out.println("array element :  "+a1[res]);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
		   System.out.println("finally block executed");
		}

		System.out.println("test() ends..");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		test(25);
		System.out.println("main() ends..");
	}

}
