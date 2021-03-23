package com.jspiders.strings;

public class Mainclass 
{
	public static void main(String[] args) 
	{
       String s1 = new String("jspiders");
       String s2 = new String("jspiders");
                     
       int h1 = s1.hashCode();
       System.out.println(h1);
       
       int h2 = s2.hashCode();
       System.out.println(h2);
       
       System.out.println(s1.toString());
       
       boolean b1 = s1.equals(s2);
       System.out.println(b1);
       
	}
}
