package com.jspiders.strings;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
       String s1 = new String("hello");
       String s2 = "hello";
       String s3 = new String("hello");
       String s4 = "hello";
       String s5 = "world";
       String s6 = s1 + s5;
       String s7 = s2 + "world";
       String s8 = "hello" + "world";
       String s9 = "helloworld";
       
       System.out.println(s1 == s2);
       System.out.println(s1 == s3);
       System.out.println(s2 == s4);
       System.out.println(s6 == s7);
       System.out.println(s8 == s9);
       
	}
}
