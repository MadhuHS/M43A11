package com.jspiders.pkg1;

public class Sample2 {
 
  public    int    v1 = 1234;
  protected double v2 = 2.34;
            long   v3 = 8787654152561l;
  private   String v4 = "hello";

  public void test1()
  {
	System.out.println("this is public-test1() of Sample2-class");
  }
  
  protected void test2()
  {
	System.out.println("this is protected-test2() of Sample2-class");
  }
  
  void test3()
  {
	System.out.println("this is pkg-level-test3() of Sample2-class");
  }
  
  private void test4()
  {
	System.out.println("this is private-test4() of Sample2-class");
  }
}
