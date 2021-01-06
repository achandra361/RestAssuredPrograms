package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class StaircaseProblem {
	
	public static int staircasesteps(int x) {
		
		if(x==1) {
			return 1;
		}
		if(x==2) {
			return 2;
		}
		if(x==3) {
			return 4;
		}
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(0,1,2,4));
		for(int i=4;i<=x;i++) {
			al.add(al.get(i-3)+al.get(i-2)+al.get(i-1));
		}
		return al.get(x);
	}
	
	public static boolean doTestsPass()
	  {
	    return staircasesteps(3) == 4
	      && staircasesteps(4) == 7;
	  }

	public static void main(String[] args) {
		
	
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
      Integer numberOfCombinations = staircasesteps(n);
      System.out.println(n + " steps => " + numberOfCombinations);
    }
  }

}
