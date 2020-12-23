package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BestAvgGrades {
	public static Integer bestAvgGrade(String[][] scores)
	  {
	    // write your code goes here
		if(scores.length == 0) {
			return 0;
		}
		Map<String,ArrayList<Integer>> map = new HashMap<>();
		for(String[] rows:scores) {
			String student = rows[0];
			Integer grades = Integer.parseInt(rows[1]);
		}
		
	    return 0;
	  }

	  public static boolean pass()
	  {
	    String[][] s1 = { { "Rohan", "84" },
	               { "Sachin", "102" },
	               { "Ishan", "55" },
	               { "Sachin", "18" } };

	    return bestAvgGrade(s1) == 84;
	  }

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("Pass");
	    }
	    else
	    {
	      System.out.println("Some Fail");
	    }
	  }
}
