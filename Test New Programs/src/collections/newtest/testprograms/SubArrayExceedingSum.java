package collections.newtest.testprograms;

public class SubArrayExceedingSum {
	public static int subArrayExceedsSum(int arr[], int target )
	  {
		int min_length = arr.length;
		for(int i=0;i<arr.length;i++) {
			int curr_length=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				curr_length = curr_length+arr[j];
				if(curr_length>target&&(j-i+1)<min_length) {
					min_length = (j-i+1);
				}
				
			}
			
		}
		
		
	  return min_length;
	  }

	  /**
	   * Execution entry point.
	  */
	  public static void main(String[] args)
	  {
	   boolean result = true; 
	  int[] arr = { 1, 2, 3, 4 };
	  result = result && subArrayExceedsSum( arr, 6 ) == 2;
	  //result = result && subArrayExceedsSum( arr, 12 ) == -1;

	  if( result )
	  {
	    System.out.println("All tests pass\n");
	  }
	  else
	  {
	    System.out.println("There are test failures\n");
	  }
	  }

}
