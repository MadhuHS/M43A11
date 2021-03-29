package com.jspiders.strings;

interface Run
{
	public String firstHalf(String str);
}

class Sample implements Run
{
	@Override
	public String firstHalf(String str) 
	{
		System.out.println(str.length());
		String res = "";
		
		StringBuffer sb1 = new StringBuffer();
		
		for(int i=0; i<= (str.length()-1)/2; i++)
		{
			sb1 = sb1.append(str.charAt(i));
		}
		res = sb1.toString();
		return res;
	}
}

public class Mainclass6
{
	
	public static void main(String[] args) 
	{
	  Sample s1 = new Sample();
	  
	 
        System.out.println(s1.firstHalf("aaaa"));  
	  
	  }
}





