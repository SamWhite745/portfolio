
public class IndexOf {
	public static void main(String[] args) {
		System.out.println("index of c in hello = " + indexOf('c',"hello"));
		System.out.println("index of o in hello = " + indexOf('o',"hello"));
	}
	
	public static int indexOf(char c, String sentence) {
		int index = -1;
		for (int i = 0; i< sentence.length();i++) {
			if (sentence.charAt(i) == c) {
				index = i;
				break;
			}
		}
		
		return index;
	}
}
