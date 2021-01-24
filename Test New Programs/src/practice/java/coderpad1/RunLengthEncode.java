package practice.java.coderpad1;

public class RunLengthEncode {
	public static String rle(String input) {
	    // Your code goes here
		if(input.length()==0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int count =1;
		char seen =0;
		char current=0;
		for(int i=0;i<input.length();i++) {
			current = input.charAt(i);
			if(seen== current) {
				count++;
				
			}
			
			seen=current;
		}
		sb.append(current).append(count);
		//System.out.println(sb.toString());
	    return sb.toString();
	  }


	 public static void main(String[] args)  {
	    
		  if("".equals(rle("")) && 
				  "a1".equals(rle("a")) && 
				  "a3".equals(rle("aaa"))){
			  System.out.println("Passed");
		  }else {
			  System.out.println("Failed");
		  }
	  }

}
