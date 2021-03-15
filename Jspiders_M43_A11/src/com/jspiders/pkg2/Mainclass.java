package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample;

public class Mainclass 
{
	public static void main(String[] args)
	{
       Sample.test1();
       
       Sample s1 = new Sample();
	   s1.display();
	   
       com.jspiders.pkg3.Sample.test1();   
	}
}
