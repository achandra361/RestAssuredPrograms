package Test_Programs_advanced;

public class LongestUniformSubstring {
	
	public static int longestUniformrepeatingSubstring(String input) {
		
		int length = input.length();
		int[][] dp = new int[length+1][length+1];
		for(int i=1;i<=length;i++) {
			for(int j = 1;j<=length;j++) {
				if(input.charAt(i-1)==input.charAt(j-1) && i!=j) {
					dp[i][j] = 1+dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[length][length];
		
	}
	
	public static int[] longestUniformSubstring(String input){
	    int longestStart = -1;
	    int longestLength = 0;

	    // your code goes here
	    int x = 1;
	    int length = input.length();
	    while(x<length){
	    int start = x-1;
	    int currentlength=1;
	      while(x<length && input.charAt(x)==input.charAt(x-1)){
	      x++;
	        currentlength++;
	      }
	      if(currentlength>longestLength){
	      longestStart = start;
	        longestLength = currentlength;
	      }
	      x++;
	    }
	    System.out.println("Longest length is "+longestLength);
	    System.out.println("Longest start is "+longestStart);
	    return new int[]{ longestStart, longestLength };
	  }

	public static void main(String[] args) {
		String input = ("aabbbbbCdAA");
		System.out.println(longestUniformrepeatingSubstring(input));
		longestUniformSubstring(input);
	}

}
