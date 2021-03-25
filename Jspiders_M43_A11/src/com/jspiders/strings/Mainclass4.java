package com.jspiders.strings;

public class Mainclass4 {
	
	public static boolean test1(String str)
	{
	    int ub = str.length()-1;
	    
	    if(str.charAt(0) == str.charAt(ub))
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
	
	public static char test2(String str)
	{
	  int mid = (str.length()-1)/2;
	  char c1 = str.charAt(mid);
	  
	  if(c1 == 'A' || c1=='E' || c1=='I' || c1=='O' || c1=='U'||
	     c1 == 'a' || c1=='e' || c1=='i' || c1=='o' || c1=='u')
	  {
		  return c1;
	  }
	  else
	  {
		  return 'z';
	  }
	}
	
	public static boolean test3(String s1,String s2)
	{
	  int mid = (s2.length()-1)/2;
	  
	  for(int i=0,j= mid+1; i<=mid && j<=(s2.length()-1); i++,j++)
	  {
	     if(s1.charAt(i) != s2.charAt(j))
	     {
		  return false; 
	     }  
	  }
	  return true;
	}
	
	public static boolean test4(String s1)
	{
	  int ub = (s1.length()-1);
	  int mid = ub/2;
	  
	  for(int i=0,j=ub; i<=mid && j>mid; i++,j--)
	  {
	     if(s1.charAt(i) != s1.charAt(j))
	     {
		  return false; 
	     }  
	  }
	  return true;
	}
	
	public static void main(String[] args) 
	{
       System.out.println(test1("hello"));
       System.out.println(test1("abba"));
       
       System.out.println(test2("hello"));
       System.out.println(test2("aei"));
       
       System.out.println(test3("aaabbb","bbbaaa"));
       System.out.println(test3("bbb","bbb"));
       System.out.println(test3("aaabbb","bbbxyz"));
       
       
       System.out.println(test4("abba"));
       System.out.println(test4("abbc"));
       System.out.println(test4("abxab"));
       System.out.println(test4("abxba"));
	}
}







