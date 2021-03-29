package com.jspiders.exceptionhandling;

public class Mainclass {

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
		catch (ArithmeticException ref) 
		{
			System.out.println("handled ArithmeticException");
			System.out.println("Zero not allowed for DIV");
		}
		catch (ArrayIndexOutOfBoundsException ref) 
		{
			System.out.println("handled ArrayIndexOutOfBoundsException");
			System.out.println("Invalid index");
		}

		System.out.println("test() ends..");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		test(0);
		System.out.println("main() ends..");
	}

}
