package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class FibbonaciSeries {
	
	public static void fibbonaci(int x) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(0,1));
		for(int i=2;i<=x-1;i++) {
			al.add(al.get(i-1)+al.get(i-2));
		}
		for(Integer n:al) {
			System.out.println(n);
		}
		
	}
	public static void main(String[] args) {
		fibbonaci(10);
	}

}
