package practice.test.programs;

public class RunLengthEncoding {
	public static String rle(String input) {
	    // Your code goes here
		if(input.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int length = 1;
		char seen = 0;
		for(int i = 0; i<input.length();i++) {
			char current = input.charAt(i);
			if(seen == current) {
				length++;
			}else {
				if(seen !=0) {
					sb.append(seen).append(length);
				}
				
					length =1;
					seen = current;
					
				}
			
		}
		sb.append(seen).append(length);
	    return sb.toString();
	  }


	 public static void main(String[] args)  {
		 
		 String input = "aaabb";
		 System.out.println(rle(input));
	    
		  if("".equals(rle("")) && 
				  "a1".equals(rle("a")) && 
				  "a3".equals(rle("aaa"))){
			  System.out.println("Passed");
		  }else {
			  System.out.println("Failed");
		  }
	  }

}
