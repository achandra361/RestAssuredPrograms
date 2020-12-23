package practice.test.programs;

public class PowerofTen {
	public static boolean isPowerOf10(int x)
	  {
	  // your code goes here
		boolean flag = false;
		for(int i=10;i<=x;i+=10) {
			if(x%i==0) {
				flag = true;
			}
		}

	  return flag;
	  }

	  public static boolean doTestsPass()
	  {
	  int[] isPowerList = {10};
	  int[] isNotPowerList = {3};

	  for(int i : isPowerList)
	  {
	    if(!isPowerOf10(i))
	    {
	    System.out.println("Test failed for: " + i);
	    return false;
	    }
	  }

	  for(int i : isNotPowerList)
	  {
	    if(isPowerOf10(i))
	    {
	    System.out.println("Test failed for: " + i);
	    return false;
	    }
	  }

	  System.out.println("All tested passed");
	  return true;
	  };


	  public static void main(String args[])
	  {
	  doTestsPass();
	  }

}
