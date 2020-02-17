public class Runner {

	public static void main(String[] args) {
		System.out.println("factorial of 10: " + factorials(10));
		System.out.println("factorial of 6: " + factorials(6));

	}

	public static int factorials(int i) {
		int factorial = 1;
		
		while (i > 0) {
			factorial = factorial * i;
			i--;
		}
		
		return factorial;
	}
}
