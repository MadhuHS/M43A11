package functional;

@FunctionalInterface
interface Run1 {
	public int add(int num1, int num2);
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
        Run1 ref1 = (int num1,int num2)->
                    {
        	          int sum = num1 + num2;
        	          return sum;
                    };
                    
        int res  = ref1.add(10,2);
        System.out.println(res);
	}
}
