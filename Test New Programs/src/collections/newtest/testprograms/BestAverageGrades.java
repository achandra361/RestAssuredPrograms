package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAverageGrades {
	public static Integer bestAvgGrade(String[][] scores)
	  {
	    // write your code goes here
		Map<String,ArrayList<Integer>> map = new HashMap<>();
		for(String[] s1:scores) {
			String student = s1[0];
			Integer marks = Integer.parseInt(s1[1]);
			ArrayList<Integer> al = map.get(student);
			if(al == null) {
				al = new ArrayList<Integer>();
				al.add(marks);
				map.put(student, al);
			}
			else
				al.add(marks);
		}
		double average = 0;
		double max = -Double.MAX_VALUE;
		for(ArrayList<Integer> list:map.values()) {
			int sum=0;
			for(Integer i:list) {
				sum +=i;
			}
			average = sum/(double)list.size();
			max= Math.max(max, average);
			
		}
	    return (int)Math.floor(max);
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
