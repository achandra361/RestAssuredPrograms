package practice.java.coderpad1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestUniformSubstring {
	
	private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

	  static int[] longestUniformSubstring(String input){
		int longestStart = -1;
	    int longestLength = 0;
	    int length = input.length();
	    
	    if(length==0) {
			  return new int[]{ longestStart, longestLength };
		  }
	    
	    int x=1;
	    while(x<length) {
	    	int seen = x-1;
	    	int count =1;
	    	while((x<length) && input.charAt(x)==input.charAt(x-1)) {
	    		count++;
	    		x++;	    		
	    	}
	    	x++;
	    	if(count>longestLength) {
    			longestStart =seen;
    			longestLength = count;
    			
    		}
	    	
	    }

	    // your code goes here
	    return new int[]{ longestStart, longestLength };
	  }

	  public static void main(String[] args) {
	    testCases.put("", new int[]{-1, 0});
	    testCases.put("10000111", new int[]{1, 4});
	    testCases.put("aabbbbbCdAA", new int[]{2, 5});

	    boolean pass = true;
	    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
	      int[] result = longestUniformSubstring(testCase.getKey());
	      pass = pass && (Arrays.equals(result, testCase.getValue()));
	    }
	    if(pass){
	      System.out.println("Pass!");
	    } else {
	      System.out.println("Failed! ");
	    }
	  }

}
