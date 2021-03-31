package wrapper;

public class Mainclass {
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


	public static void printOutput(Object obj) {
		System.out.println("printOutput(Object obj)");
		System.out.println(obj);
	}

	public static void main(String[] args) {
		int res1 = add(10, 10);
		Integer i1 = new Integer(res1);
		printOutput(i1);

		double res2 = add(5.2, 2.0);
		Double d1 = new Double(res2);
		printOutput(d1);
		
		boolean b1 = false;
		Boolean b2 = new Boolean(b1);
		printOutput(b2);
		
		char c1 = 'A';
		Character c2 = new Character(c1);
		printOutput(c2);

		String str = add("hello", "world");
		printOutput(str);

		StringBuffer sb1 = new StringBuffer("hello");
		printOutput(sb1);
	}
}




