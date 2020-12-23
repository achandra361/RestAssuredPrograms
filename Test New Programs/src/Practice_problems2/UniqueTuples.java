package Practice_problems2;

import java.util.HashSet;

public class UniqueTuples {
	public static HashSet<String> uniqueTuples( String input, int len ) throws IllegalArgumentException {
	    // your code
	    HashSet<String> result = new HashSet<String>();
	    int length = 0;
	    if(input == null) {
	    	throw new IllegalArgumentException("Argument is invalid");
	    }
	    else {
	    	length = input.length();
	    	for(int i=0;i<(length-len+1);i++) {
	    		result.add(input.substring(i, (i+len)));
	    	}
	    }
	    return result;
	  }

	  public static void main( String[] args ) {
	    String input = "aab";
	    HashSet<String> result = uniqueTuples( input, 2 );
	    if( result.contains( "aa" ) && result.contains( "ab" ) ) {
	      System.out.println( "Test passed." );
	     
	    } else {
	      System.out.println( "Test failed." );
	      
	    }
	  }

}
