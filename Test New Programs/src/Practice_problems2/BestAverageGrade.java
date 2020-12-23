package Practice_problems2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {
	public static Integer bestAvgGrade(String[][] scores)
	  {
	    // write your code goes here
		if(scores.length == 0) {
	    return 0;
		}
		Map<String , ArrayList<Integer>> map = new HashMap<>();
		for(String[] rows:scores) {
			if(rows.length !=2) {
				return 0;
			}
			String student = rows[0];
			Integer grade = Integer.parseInt(rows[1]);
			ArrayList<Integer> current_grade = map.get(student);
			if(current_grade == null) {
				current_grade = new ArrayList<Integer>();
				current_grade.add(grade);
				map.put(student, current_grade);
			}
			else {
				current_grade.add(grade);
			}
		}
		double max = 0;
		for(ArrayList<Integer> student_grade : map.values()) {
			int sum =0;
			for(int i:student_grade) {
				sum += i;
			}
			double average = sum /(double)student_grade.size();
			max = Math.max(max, average);
		}
		return (int)Math.floor(max);
	  }

	  public static void main(String[] args) {
		    String[][] s1 = { { "Rohan", "84" },
		               { "Sachin", "102" },
		               { "Ishan", "55" },
		               { "Sachin", "18" } };
		System.out.println(bestAvgGrade(s1));
	}
}
