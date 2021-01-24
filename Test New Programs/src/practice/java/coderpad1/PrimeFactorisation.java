package practice.java.coderpad1;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactorisation {
	public static ArrayList<Integer> primeFactorization(int x)
	  {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=2;i<=x;i++) {
			if(x%i==0) {
				al.add(i);
				x=x/i;
			}
			
		}
		
	  return al;
	  }

	public static void main(String args[])
	  {
		
		System.out.println(primeFactorization(6) + " " + primeFactorization(5)); 
		if(primeFactorization(6).equals(Arrays.asList(2,3)) 
				&& 
				primeFactorization(30).equals(Arrays.asList(2,3,5))
				) {
			System.out.println("All passed");
		}else {
			System.out.println("Failed");
		}
	  
	  }

}
