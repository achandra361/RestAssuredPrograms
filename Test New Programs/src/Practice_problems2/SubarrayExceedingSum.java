package Practice_problems2;

public class SubarrayExceedingSum {
	public static int subArrayExceedsSum(int arr[], int target )
	  {
		int min_len = arr.length+1;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum +arr[i];
			
			
			
			int curr_sum = arr[i];
			
			if(arr[i]>=target) {
				return 1;
			}
			for(int j=i+1;j<arr.length;j++) {
				curr_sum += arr[j];
				if(curr_sum>target && (j-i+1)<min_len)
					min_len = j-i+1;
			}
		}
		if(sum==target) {
			return arr.length;
		}
		if(sum<target) {
			return -1;
		}
		
	  return min_len;
	  }

	  /**
	   * Execution entry point.
	  */
	  public static void main(String[] args)
	  {
	   boolean result = true; 
	  int[] arr = { 1, 2, 3, 4 };
	  result = result && subArrayExceedsSum( arr, 6 ) == 2;
	  result = result && subArrayExceedsSum( arr, 7 ) == 3;
	  result = result && subArrayExceedsSum( arr, 12 ) == -1;
	  result = result && subArrayExceedsSum( arr, 10 ) == 4;
	  result = result && subArrayExceedsSum( arr, 4 ) == 1;


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
