package Test_Programs_advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SetofAnagrams {
	
	public static void anagramfromstring(String input) {
		
		
		HashMap<String , List<String>> map = new HashMap<>();
			for(String word:input.split(" ")) {
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String newWord = new String(letters);
		
		if(map.containsKey(newWord)) {
			map.get(newWord).add(word);
		}
		else {
			List<String> words = new ArrayList<>();
			words.add(word);
			map.put(newWord, words);
		}
		}
		StringBuilder sb = new StringBuilder();
		for(String s :map.keySet()) {
			List<String> values = map.get(s);
			for(String str:values) {
			sb.append(str+" ");
			}
		}
		System.out.println(sb.toString());
	
	}
	
	
	public static void main(String[] args) {
		anagramfromstring("cat dog tac ram god mar");
	}

}
