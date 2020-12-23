package Test_Programs_advanced;

public class CheckPower {
	public static boolean powerof10(int x) {
		
		for(int i=1;i<=x;i*=10) {
			if(i==x) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(powerof10(10009));
	}

}
