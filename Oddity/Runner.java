package oddities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		System.out.println("nums = 5, 8, 9, 12, 51, 75, 88, 2");
		int[] nums = {5, 8, 9, 12, 51, 75, 88, 2};
		System.out.println(oddity(nums).toString());
	}
	
	public static List<Integer> oddity(int[] nums) {
		return Arrays.stream(nums).boxed().filter(num -> num % 2 == 1).collect(Collectors.toList());
	}
}
