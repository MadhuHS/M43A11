package com.jspiders.strings;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
       String s1 = "jspiders";
       String s2 = "JSPIDERS";
       
       int len = s1.length();
       System.out.println(len);
       
       char c1 = s1.charAt(5);
       System.out.println(c1);
       
       int i1 = s1.indexOf('p');
       System.out.println(i1);
       
       int i2 = s1.indexOf('s');
       System.out.println(i2);
       
       int i3 = s1.indexOf('s',2);
       System.out.println(i3);
       
       boolean b1 = s1.equals(s2);
       System.out.println(b1);
       
       boolean b2 = s1.equalsIgnoreCase(s2);
       System.out.println(b2);
       
       String str = s1.substring(2,7);
       System.out.println(str);
        
	}
}





