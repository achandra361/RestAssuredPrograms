package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupMaxRepitation {
	
	public static void GroupMaxRepitation(String input) {
		Map<String,List<String>> map = new HashMap<>();
		for(String str:input.split(" ")) {
			char[] letter=str.toCharArray();
			Arrays.sort(letter);
			String newword = new String(letter);
			if(map.containsKey(newword)) {
				map.get(newword).add(str);
			}
			else {
				List<String> l = new ArrayList<>();
				l.add(str);
				map.put(newword, l);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String s:map.keySet()) {
			List<String> list = map.get(s);
			for(String str:list) {
				sb.append(str+" ");
			
		}
	}
		System.out.println(sb.toString());
}
	public static void main(String[] args) {
		GroupMaxRepitation("cat dog tac sat tas god dog");
	}
}
