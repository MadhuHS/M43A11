package wrapper;

public class Mainclass2 {
	public static int add(int a1, int b1) {
		int sum = a1 + b1;
		return sum;
	}

	public static double add(double a1, double b1) {
		double sum = a1 + b1;
		return sum;
	}

	public static String add(String a1, String b1) {
		String sum = a1 + b1;
		return sum;
	}


	//Upcasting
	public static void printOutput(Object obj)//Object obj = i1;
	{
		System.out.println("printOutput(Object obj)");
		System.out.println(obj);
	}

	public static void main(String[] args) {
		int i1 = add(10, 10);
		printOutput(i1);
		
		Integer i2 = add(10, 10);
		printOutput(i2);

		double d1 = add(5.2, 2.0);
		printOutput(d1);
		
		boolean b2 = false;
		printOutput(b2);
		
		char c2 = 'A';
		printOutput(c2);

		String str = add("hello", "world");
		printOutput(str);

		StringBuffer sb1 = new StringBuffer("hello");
		printOutput(sb1);
	}
}




