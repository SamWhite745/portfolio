public class Runner {

	public static void main(String[] args) {
		System.out.println("is char 'c' in string 'lucky' at position '3': " + find("lucky", 3, 'c'));
		System.out.println("is char 'j' in string 'falafel' at position '5': " + find("falafel", 5, 'j'));

	}
	
	public static boolean find(String s, int i, char c) {
		return s.charAt(i-1) == c;
	}
}

