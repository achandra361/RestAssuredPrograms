package test_programs;

public class CheckPrime {
	
	public void primenumbercheck(int n) {
		boolean flag = false;
		for(int i=2;i<=n/2;i++) {
			if (n%i == 0) {
			flag = true;
			}
		}
		
		if(flag == true) {
			System.out.println("Not prime");
		}
		else
			System.out.println(" Prime");
	}
	public static void main(String[] args) {
		CheckPrime c = new CheckPrime();
		c.primenumbercheck(15);
	}
}
