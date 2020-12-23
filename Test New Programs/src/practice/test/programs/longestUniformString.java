package practice.test.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class longestUniformString {

		  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

		  static int[] longestUniformSubstring (String input){
		    int longestStart = -1;
		    int longestLength = 0;

		    // your code goes here
		    if(input.length() ==0) {
		    	System.out.println("No Argument Passed");;
		    }
		    
		    int x= 1;
		    int length = input.length();
		    while(x<length) {
		    	int seen = x-1;
		    	int count = 1;
		    	while((x<length) && input.charAt(x)== input.charAt(seen)) {
		    		x++;
		    		count++;
		    	}
		    	x++;
		    	if(count>longestLength) {
		    		longestStart = seen;
		    		longestLength = count;
		    	}
		    }
			
		    return new int[]{ longestStart, longestLength };
		    
		  }

		  public static void main (String[] args) {
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


