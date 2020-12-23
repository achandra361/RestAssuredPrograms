package Test_Programs_advanced;

public class PowerofNumber {
	public static double power(double base,int exp) {
		double pow=1 ;
		for(int i=1;i<=exp;i++) {
			pow= pow*base;
		}
		return pow;
	}
	public static void main(String[] args) {
		System.out.println(power(2, 5));
	}

}
