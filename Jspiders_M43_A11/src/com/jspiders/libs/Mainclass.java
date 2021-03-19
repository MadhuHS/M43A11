package com.jspiders.libs;

public class Mainclass
{
	public static void main(String[] args)
	{
	   System.out.println("Program starts...");
	   Object obj1 = new Object();
	   Object obj2 = new Object();
	   Object obj3 = obj1;
	   
	   int h1 = obj1.hashCode();
	   System.out.println("h1 : "+h1);
	   
	   System.out.println("h2 : "+obj2.hashCode());
	   
	   String s1  = obj1.toString();
	   System.out.println(s1);
	   
	   System.out.println(obj2);//println()-->toString()
	   
	   boolean b1 = obj1.equals(obj2);
	   System.out.println(b1);
	   
	   System.out.println(obj1.equals(obj3));
	  
	   System.out.println("Program ends...");

	}
}

