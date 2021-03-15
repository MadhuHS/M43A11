package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample2;

public class Mainclass2 extends Sample2
{
	public static void main(String[] args)
	{
       Sample2 s2 = new Sample2();
       System.out.println(s2.v1);
       s2.test1();
       
       Mainclass2 m2 = new Mainclass2();
       System.out.println(m2.v2);
       m2.test2();
	}
}
