package collections.newtest.testprograms;

public class lengthEncoding {
	
	public static String rle(String input) {
	    // Your code goes here
		if(input.length()==0) {
			return "";
		}
		//int count=1;
		StringBuilder sb = new StringBuilder();
		int count=1;
		char seen = 0;
		//System.out.println(seen);
		for(int i=0;i<input.length();i++) {
			char current = input.charAt(i);
			if(seen == current) {
				count++;
			}
			else {
				if(seen!=0) {
					sb.append(seen).append(count);
				}
				count =1;
				seen=current;
			}
		}
		sb.append(seen).append(count);
		System.out.println(sb.toString());
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
