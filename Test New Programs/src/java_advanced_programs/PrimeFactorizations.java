package java_advanced_programs;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactorizations {
	
	public static ArrayList<Integer> primeFactorization(int x)
	  {
		if(x==0) {
			System.out.println("Wrong Argument");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<=x;i++) {
			if(x%i==0) {
				list.add(i);
				x=x/i;
			}
			
		}
	  return list;
	  }

	public static void main(String args[])
	  {
		
		System.out.println(primeFactorization(6) + " " + primeFactorization(5)); 
		if(primeFactorization(6).equals(Arrays.asList(2,3)) 
				&& 
				primeFactorization(5).equals(Arrays.asList(5))
				) {
			System.out.println("All passed");
		}else {
			System.out.println("Failed");
		}
	  
	  }

}
