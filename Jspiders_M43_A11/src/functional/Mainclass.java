package functional;

@FunctionalInterface
interface Run {
	public void count(int num);
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
		Run ref = (int num) -> {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		};

		Run ref2 = (int num) -> {
			for (int i = num; i >= 1; i--) {
				System.out.println(i);
			}
		};

		ref.count(5);
		ref2.count(5);
	}
}
