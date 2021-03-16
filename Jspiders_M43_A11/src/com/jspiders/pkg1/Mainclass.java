package com.jspiders.pkg1;

class Superclass
{
	protected void test()
	{
		System.out.println("test() of Superclass");
	}
}

class Subclass extends Superclass
{
	@Override
	public void test() 
	{ 
	   System.out.println("Overriding test()");	
	}
}


public class Mainclass 
{
	public static void main(String[] args) 
	{
       new Subclass().test();
	}
}









