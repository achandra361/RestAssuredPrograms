package Practice_problems2;

import java.util.ArrayList;
import java.util.Arrays;

public class StaircaseProblem {
	public static Integer countSteps(Integer n)
	  {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		if(n==3) {
			return 4;
		}
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(0,1,2,4));
		for(int i =4;i<=n;i++) {
			al.add(al.get(i-3)+al.get(i-2)+al.get(i-1));
		}
	    return al.get(n);
	  }


	  public static boolean doTestsPass()
	  {
	    return countSteps(3) == 4
	      && countSteps(4) == 7;
	  }

	  public static void main(String[] args)
	  {
	    if(doTestsPass())
	    {
	      System.out.println("All tests pass");
	    }
	    else
	    {
	      System.out.println("Tests fail.");
	    }

	    for (Integer n = 1; n <= 5; n++)
	    {
	      Integer numberOfCombinations = countSteps(n);
	      System.out.println(n + " steps => " + numberOfCombinations);
	    }
	  }

}
