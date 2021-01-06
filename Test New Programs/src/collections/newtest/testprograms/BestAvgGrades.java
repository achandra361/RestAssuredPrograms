package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.Arrays;
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
		for(String[] rows:scores){
			String student = rows[0];
			Integer grades = Integer.parseInt(rows[1]);
		
		ArrayList<Integer> al = map.get(student);
		if(al==null) {
			al = new ArrayList<Integer>();
			al.add(grades);
			map.put(student, al);
		}else {
			al.add(grades);
		}
		}
		double max= -Double.MAX_VALUE;
		
		double average = 0;
		for(ArrayList<Integer> student_grade :map.values()) {
			int sum =0;
			for(int i:student_grade) {
				sum +=i;
			}
			average = sum/(double)student_grade.size();
			max = Math.max(max, average);
		}
		
	    return (int) Math.floor(max);
	  }

	  

	public static boolean doTestsPass()
	  {
	    Map<String[][], Integer> testCases = new HashMap<>();

	    testCases.put(new String[][] { { "Bobby", "87" },
	                     { "Charles", "100" },
	                     { "Eric", "64" },
	                     { "Charles", "22" } },
	            87);
	    testCases.put(new String[][] {},
	            0);
	    testCases.put(new String[][] { { "Sarah", "91" },
	                     { "Goldie", "92" },
	                     { "Elaine", "93" },
	                     { "Elaine", "95" },
	                     { "Goldie", "94" },
	                     { "Sarah", "93" } },
	            94);
	    testCases.put(new String[][] { { "Janie", "-66" },
	                     { "Janie", "0" },
	                     { "Gina", "-88" },
	                     { "Bobby", "0" },
	                     { "Gina", "44" },
	                     { "Bobby", "0" },
	                     { "Bobby", "-6" } },
	            -2);
	    testCases.put(new String[][] { { "Alpha", "99" },
	                     { "Bravo", "99" },
	                     { "Charlie", "99" },
	                     { "Delta", "99" },
	                     { "Echo", "99" },
	                     { "Foxtrot", "99" },
	                     { "Foxtrot", "99" } },
	            99);
	    testCases.put(new String[][] { { "Gerald", "91" },
	                     { "Gerald", "92" } },
	            91);
	    testCases.put(new String[][] { { "Barry", "-66" },
	                     { "Barry", "-65" },
	                     { "Alfred", "-122"} },
	            -66);

	    boolean passed = true;
	    for(Map.Entry<String[][], Integer> entry : testCases.entrySet())
	    {
	      Integer actual = bestAvgGrade(entry.getKey());
	      if(actual != entry.getValue())
	      {
	        passed = false;
	        System.out.println("Failed for " + Arrays.deepToString(entry.getKey()) + "\n  expected " + entry.getValue() + ", actual " + actual);
	      }
	    }

	    return passed;
	  }

	  public static void main(String[] args)
	  {
	    if(doTestsPass())
	    {
	      System.out.println("All tests pass");
	      System.out.println("Hip Hip Hurrah");
	    }
	    else
	    {
	      System.out.println("Tests fail.");
	    }
	  }
		  
}
