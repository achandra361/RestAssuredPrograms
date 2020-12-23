package practice.test.programs;

public class MedianofTwoArrays {
	public static double logic(int[] A, int[] B) {
		double sum = 0;
	    double size = A.length + B.length;
	    for(int i=0;i<A.length;i++){
	      sum = sum + A[i];
	    }
	    for(int i = 0; i<B.length;i++){
	      sum = sum + B[i];
	    }
	    double result = sum/size ;
	    //System.out.println(result);
			
		  return result;
		  //your code
		  }

		  public static boolean pass()
		  {
		  boolean result = true;
		  result = result && logic(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
		  result = result && logic(new int[]{1, 3}, new int[]{2}) == 2.0;
		  return result;
		  };

		  public static void main(String[] args)
		  {
		  if(pass())
		  {
		    System.out.println("pass");
		  }
		  else
		  {
		    System.out.println("some failures");
		  }
		  }
}
