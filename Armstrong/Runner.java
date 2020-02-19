import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Armstrong numbers between 1 and 1000:");
		System.out.println(Arrays.toString(armstrong(1000).toArray()));		
	}

	public static boolean isArmstrong(int num) {
		char[] numChars = Integer.toString(num).toCharArray();
		List<Integer> nums = new ArrayList<>();
		for (char numChar : numChars) {
			nums.add(Character.getNumericValue(numChar));
		}

		int total = 0;
		for (Integer c : nums) {
			total += (c * c * c);
		}

		return total == num;
	}

	public static List<Integer> armstrong(int max) {
		return IntStream.range(1, max + 1).boxed().filter(num -> isArmstrong(num)).collect(Collectors.toList());
	}
}
