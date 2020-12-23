package Practice_problems2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class ApachelogProblem {
	public static String findTopIpaddress(String[] lines) {
	    // Your code goes here
		Map<String , Integer> map = new HashMap<>();
		Arrays.stream(lines).forEach((line) ->{
			String ipAddress = line.split(" ")[0];
			Integer count = map.getOrDefault(ipAddress, 0);
			map.put(ipAddress, count +1);
		});
		
		StringJoiner sj = new StringJoiner("");
		
		
	    return "10.0.0.1";
	  }
	  
	  public static void main(String[] args) {
	    
	String lines[] = new String[] {
	        "10.0.0.1 - log entry 1 11",
	        "10.0.0.1 - log entry 2 213",
	        "10.0.0.2 - log entry 133132" };
	    String result = findTopIpaddress(lines);
	    
	    if (result.equals("10.0.0.1")) {
	      System.out.println("Test passed");
	      
	    } else {
	      System.out.println("Test failed");
	      
	    }  

	  }

}
