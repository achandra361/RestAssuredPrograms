package practice.test.programs;

import java.util.Arrays;

public class SecondSmallestNumber {
	public static int secondSmallest(int[] x) {
		// Your code
		if(x.length == 0) {
			System.out.println("Empty Array");
		}
		else
			if(x.length==1) {
				return x[0];
			}
			else 
				Arrays.sort(x);
			
		return x[1];
	}

	public static void main(String args[]) {

		int[] a = { 0 };
		int[] b = { 0, 1 };

		boolean result = true;
		result &= secondSmallest(a) == 0;
		result &= secondSmallest(b) == 1;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
