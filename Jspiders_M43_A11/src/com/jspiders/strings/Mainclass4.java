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
	
	public static boolean catDog(String str) 
	{
	     if(str.length() <= 2)
	     {
	       return true;
	     }
	     
	     if(str.length() < 6)
		   {
			   return false;
		   }
		  
		   int c1 = 0;
		   int d1 = 0;
		   
		   for(int i=0; i<= str.length()-3; i++)
		   {
		   if(str.charAt(i) =='c' 
		     && str.charAt(i+1) == 'a' 
		     && str.charAt(i+2) == 't')
		   {
			   c1++;
		   }
		   if(str.charAt(i) =='d' 
		     && str.charAt(i+1) == 'o' 
		     && str.charAt(i+2) == 'g')
		   {
			   d1++;
		   }
		   }
		   
		   if(c1==d1)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }   
	}
	
	public static void test5(String str)
	{
		int alpha=0;
		int number=0;
		int spl=0;
		
		for (int i = 0; i <= str.length()-1; i++) 
		{
			char ch = str.charAt(i);
			int ascii = ch;
			
			if( (ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) )
	        {
		      alpha++;
	        }
			
			else if((ascii>=48 && ascii<=57))
			{
				number++;
			}
			
			else
			{
				spl++;
			}	
		}
        
        System.out.println("alphabets : "+alpha);
        System.out.println("numbers   : "+number);
        System.out.println("spl char  : "+spl);
	}
	
	public static void main(String[] args) 
	{
       /*System.out.println(test1("hello"));
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
       
       
       System.out.println(catDog("catdog"));
       System.out.println(catDog("catcat"));
       System.out.println(catDog("cat"));
       System.out.println(catDog("dogcat"));
       System.out.println(catDog("1cat1cadodog"));*/
		
		
	   test5("abc@123");
       
	}
}







