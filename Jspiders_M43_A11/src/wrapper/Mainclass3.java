package wrapper;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
      int x1 = 123;
      Integer i1 = x1;
      
      Object obj1 = new String("hello");
      Object obj2 = "hello";
      /* 1.Create the object of String class
       * 2.Assign the address of String class object to
       *   Object class ref var and perform Upcasting */
      
      Object obj3 = new Integer(10);
      Integer i2 = 10;//Autoboxing
      Object obj4 = i2;//Upcasting
      
      Object obj5 = 123;
      /* If u try to assign primitive value to Object class ref var
       * then, JVM
       * 1.Create the object of corresponding wrapper class
       * 2.Assign the address of wrapper class object to
       *   Object class ref var and perform Upcasting */
	}
}
