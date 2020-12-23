package practice.test.programs;

public class AddFraction {
	
	public static int[] addFractions( int[] fraction1, int[] fraction2 ) {
	    // Write your code here
		if(fraction1.length<=1 || fraction2.length<=1) {
			System.out.println("Invalid Arguments");
		}
		int denominator = 0;
		int numerator = 0;
		int i = 0;
			denominator = fraction1[i+1]*fraction2[i+1];
			numerator = fraction1[i]*((denominator/fraction1[i+1])) + (fraction2[i]*(denominator/fraction2[i+1]));
		
		return ( new int[]{ numerator, denominator } );
	  }

	  
	  public static void main( String[] args ) {
	    int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

	    if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
	      System.out.println( "Test passed." );
	      
	    } else {
	      System.out.println( "Test failed." );
	    }
	  }
}
