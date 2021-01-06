package java_advanced_programs;

public class SmallestInteger {
	public static int FindMin(int a[])
	  {
	    /*
	    ** Your code goes here
	    */
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	    return a[0];
	  }

	  public static void main(String args[])
	  {
	    boolean result = true;
	    result = result && FindMin(new int[]{3,4,5,6,1,2}) == 1;
	    result = result && FindMin(new int[]{2,1}) == 1;
	    result = result && FindMin(new int[]{1}) == 1;

	    try {
	      FindMin(null);
	      result = false;
	    }
	    catch(Exception e)
	    {
	      result = result && true;
	    }

	    if(result)
	    {
	      System.out.println("All tests pass");
	    }
	    else
	    {
	      System.out.println("There are test failures");
	    }
	  }
}
