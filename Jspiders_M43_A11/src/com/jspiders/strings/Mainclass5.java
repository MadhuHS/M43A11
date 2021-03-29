package com.jspiders.strings;

public class Mainclass5
{
	public static void main(String[] args) 
	{
       StringBuffer sb1 = new StringBuffer("hello");
       StringBuffer sb2 = new StringBuffer("hello");
       
       int i1 = sb1.hashCode();
       int i2 = sb2.hashCode();
       
       System.out.println(i1);
       System.out.println(i2);
       
       System.out.println(sb1.toString());
       
       System.out.println(sb1.equals(sb2));
       
       
       
       
	}
}
