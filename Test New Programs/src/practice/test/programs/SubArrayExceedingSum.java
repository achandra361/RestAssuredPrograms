package practice.test.programs;

public class SubArrayExceedingSum {
	public static int subArrayExceedsSum(int arr[], int target )
	  {
		int min_length = arr.length;
		for(int i=0;i<arr.length;i++) {
			int curr_sum = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				curr_sum = curr_sum+ arr[j];
				if(curr_sum>target && (j-i +1)<min_length)
					min_length = (j-i+1);
				
			}
		}
		
		
	  return min_length;
	  }

	  /**
	   * Execution entry point.
	  */
	 public static void main(String[] args) {
		
	
	 
		 int arr[] = {1,2,4,7};
		 int target =11;
		 System.out.println(subArrayExceedsSum(arr, target));
		 boolean result = true; 
		  int[] arr1 = { 1, 2, 3, 4 };
		  result = result && subArrayExceedsSum( arr1, 6 ) == 2;
		  result = result && subArrayExceedsSum( arr1, 7 ) == 3;
		  result = result && subArrayExceedsSum( arr1, 10 ) == 4;
		  result = result && subArrayExceedsSum( arr1, 4 ) == 2;
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



