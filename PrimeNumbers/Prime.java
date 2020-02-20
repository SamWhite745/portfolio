import java.util.stream.IntStream;

public class Prime{
	public static void main(String[] args) {
		System.out.println("amount of primes from 1 to 1000: " + primeNumbers(1000));
	}
	
	public static int primeNumbers(int max) {
		return (int) IntStream.rangeClosed(2,max).filter(num -> isPrime(num)).count();
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
}
