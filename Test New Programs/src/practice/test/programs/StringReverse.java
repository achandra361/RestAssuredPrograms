package practice.test.programs;

public class StringReverse {
	public static String reverseStr( String str ){
	    //your code goes here
		String reverse = "";
		for(int i = str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
	    return reverse;
	  }

	  
	  public static void main(String[] args){
	  
	  boolean result = true;

	    result = result && reverseStr("abcd").equals("dcba");
	  
	  if(result){
	    System.out.println("All tests pass");
	  }
	  else{
	    System.out.println("There are test failures");
	  }

	   }
	

}
