package collections.newtest.testprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortedMapSet {
	
	public static void SetInsideMap(String name,int[] battingavg) {
		Map<String,Set<Integer>> map = new HashMap<>();
		Set<Integer> set = new TreeSet<>();
		int sum = 0;
		for(int i:battingavg) {
			sum = sum +i;
			set.add(i);
		}
		double avg = (double)sum/set.size();
		map.put(name, set);
		for(Map.Entry m:map.entrySet()) {
			System.out.print(m.getKey()+" "+m.getValue());
		}
		System.out.println(" Batting avg is " + avg);
	}
	public static void main(String[] args) {
		String name = "Sachin";
		int[] battingavg = {55,67,109,45,88,92};
		SetInsideMap(name, battingavg);
		
		
	}
}
