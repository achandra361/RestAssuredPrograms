package Test_Programs_advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorization {
	
	public static  List<Integer> Primefactors(int x) {
		List<Integer> l = new ArrayList<Integer>();
		while(x<2) {
			return l;
		}
		for(int i= 2;i<=x;i++) {
			while(x%i==0) {
				x=x/i;
				l.add(i);
			}
		}
		return l;
		
	}
public static void main(String[] args) {
	int x= 225;
	System.out.println(Primefactors(x));
}
}
