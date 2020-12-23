package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachExample {
	public static void testforeach(String name,int[] marks) {
	Map<String , ArrayList<Integer>> map = new HashMap<>();
	ArrayList<Integer> l = new ArrayList<>();
	for(int i:marks) {
		l.add(i);
	}
	map.put(name, l);
	map.entrySet().forEach(student->System.out.println(student));
	double average = 0;
	double sum =0;
	for(int i=0;i<marks.length;i++) {
		sum += marks[i];
	}
	average= (sum/(l.size()));
	System.out.println(average);
	
}
	public static void main(String[] args) {
		String name= "Animesh";
		int[] marks = {34,78,100,97,98};
		testforeach(name, marks);
	}
}
