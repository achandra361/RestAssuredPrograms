package practice.test.programs;

public class PowerofNumber {
	public static double power(double base, int exp) {
	    //Your code goes here
		double power = 1;
		for(int i = 1;i<=exp;i++) {
			power = power*base;
		}
	    return power;
	  }

	  public static boolean doTestPass() {
	    boolean testsPass = true;
	    double result = power(2,2);
	    return testsPass && result==4;
	  }

	  public static void main( String[] args ) {
	    if(doTestPass()){
	      System.out.println("Pass");
	    }
	    else{
	      System.out.println("There are failures");
	    }
	  }
}
