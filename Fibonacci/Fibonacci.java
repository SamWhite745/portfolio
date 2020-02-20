
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Fib index of 10: " + fib(10));
	}
	
	public static int fib(int pos) {
		if (pos == 0) return 0;
		else if (pos == 1) return 1;
		else return fib(pos-1) + fib(pos-2);
	}
}
