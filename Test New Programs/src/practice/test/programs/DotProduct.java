package practice.test.programs;

public class DotProduct {
	public static int dotProduct( int[] array1, int[] array2 ) {
	    // code goes here
		int i=0;
		int product =0;
		while(i<array1.length){
		product = product +(array1[i]*array2[i]);
	    i++;
	  }
		return product;
	}
	 
	  public static void main( String[] args ) {
	   int[] array1 = { 1, 2 };
	    int[] array2 = { 2, 3 };
	    int result = dotProduct( array1, array2 );

	    if( result == 8 ) {
	      System.out.println( "Passed." );
	    } else {
	      System.out.println( "Failed." );
	    }
	  }

}
