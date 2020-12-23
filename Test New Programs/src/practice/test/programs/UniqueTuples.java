package practice.test.programs;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueTuples {
	public static HashSet<String> uniqueTuples(String input, int len) throws IllegalArgumentException {
		HashSet<String> set = new HashSet<String>();
		int length = 0;

		if (input == null) {
			throw new IllegalArgumentException("Input string cannot be null.");
		} else {
			length = input.length();
		}

		if (length == 0) {
			throw new IllegalArgumentException("Input string cannot be of zero length.");
		}

		if (len <= 0) {
			throw new IllegalArgumentException("Length of tuples has to be greater than zero.");
		}

		if (len > length) {
			throw new IllegalArgumentException(
					"Length of the tuple cannot be more than the length of the input string.");
		}

		for (int i =0;i<(length-len+1);i++) {
			set.add(input.substring(i, (i+len)));
		}

		return set;
	}

	public static void main(String[] args) {
		
		String input = "aab";
		String input1 = "abbccde";
		
		HashSet<String> result = uniqueTuples(input, 2);
		HashSet<String> result1 = uniqueTuples(input1, 2);
		
		if ((result.contains("aa") && result.contains("ab"))
				&& (result1.containsAll(Arrays.asList("ab", "bb", "bc", "cc", "cd", "de")) && result1.size() == 6)) {
			System.out.println("Test passed.");
		} else {
			System.out.println("Test failed.");
		}

	}

}
