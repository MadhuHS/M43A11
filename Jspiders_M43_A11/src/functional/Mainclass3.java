package functional;

@FunctionalInterface
interface Run3
{
  public int add(int a,int b,int c);
}
public class Mainclass3 
{
	public static int findAvg(Run3 r1)
	{
		int sum = r1.add(2, 3, 4);
		int avg = sum/3;
		return avg;
	}
	
	public static void main(String[] args) 
	{
		 Run3 ref = (int a,int b,int c)->
		 { 
			return a+b+c; 
		 };
		 
		 findAvg(ref);
		 
	}
}








