public class Runner {
	public static void main(String[] args) {
		System.out.println(fizzBuzzPopSnap(15));
		System.out.println(fizzBuzzPopSnap(165));
	}
	
	public static String fizzBuzzPopSnap(int num) {
		StringBuilder sbReturn = new StringBuilder();
		if (num % 3 == 0) sbReturn.append("Fizz");
		if (num % 5 == 0) sbReturn.append("Buzz");
		if (num % 7 == 0) sbReturn.append("Pop");
		if (num % 11 == 0) sbReturn.append("Snap");
		if (sbReturn.toString().equals("")) return String.valueOf(num);
		else return sbReturn.toString();
	}
}
