
public class Runner {
	public static void main(String[] args) {
		System.out.println(robOrBorrow("race car"));
	}
	
	public static boolean robOrBorrow(String sentence) {
		sentence = sentence.replace(" ", "").toLowerCase();

		StringBuilder sbReverse = new StringBuilder(sentence);
		String reverse = sbReverse.reverse().toString();
		
		return (sentence.equals(reverse));
	}
}
