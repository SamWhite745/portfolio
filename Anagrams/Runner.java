import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Does apple = paepl " + anagrams("apple", "paepl"));
	}
	
	public static boolean anagrams(String a, String b) {
		char[] aChars = a.toCharArray();
		char[] bChars = b.toCharArray();
		Arrays.sort(aChars);
		Arrays.sort(bChars);

		return (Arrays.equals(aChars, bChars));
	}
}
