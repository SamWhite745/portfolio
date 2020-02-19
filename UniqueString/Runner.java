//import java.util.Arrays;
//import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		System.out.println(uniqueString("lolLipop"));
	}
	
	public static String uniqueString(String sentence) {
		sentence = sentence.replace(" ", "");

		String uniques = "";
		
		for (int i = 0; i < sentence.length(); i ++) {
			if (uniques.indexOf(sentence.charAt(i)) == -1) {
				uniques = uniques + sentence.charAt(i);
			}
		}
		
		return (uniques);
		
		//return Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining(""));
	}
}
