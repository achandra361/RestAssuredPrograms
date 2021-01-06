package collections.newtest.testprograms;

public class PrimeCheck {
	public static boolean primecheck(int x) {
		for(int i=2;i<x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
	if(primecheck(21)== true) {
		System.out.println("It is a prime Number");
	}
	else 
		System.out.println("Not a prime Number");
	}

}
