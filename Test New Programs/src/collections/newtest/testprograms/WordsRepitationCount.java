package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordsRepitationCount {
	
	public static void wordrepitationcount(String sentence) {
		String input = sentence.toLowerCase();
		HashMap<Integer,String> map = new HashMap<>();
		String[] str = input.split(" ");
		int i=1;
		for(String s:str) {
			map.put(i, s);
			i++;
		}
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer,String>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer, String>>() {

			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
			}
		});
		Map<Integer,String> lm = new LinkedHashMap<Integer, String>();
		int count=1;
		for(Map.Entry m:list) {
	
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}
		//System.out.println(map);

	}
	
	public static void repitationofwords(String input) {
		
		char[] words = input.toCharArray();
		for(int i=0;i<words.length;i++) {
			int count = 1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i]==words[j] && words[i]!=' ') {
					count++;
					words[j]='0';
				}
			}
			if(count>1 && words[i]!='0') {
				System.out.println(words[i]);
			}
		}
		
	}
	
	public static void wordoccurences(String input) {
		ArrayList<String> list = new ArrayList<>();
		//String[] s=input.split(" ");
		for(String str:input.split(" ")) {
			list.add(str);
		}
		for(String s:input.split(" ")) {
			int count=1;
			//char[] letters = s.toCharArray();
			//Arrays.sort(letters);
			//String word = new String(letters);
			if(list.contains(s)) {
				count++;
			}
			//System.out.println(list.toString());
			
		}
		
		
		
	}
	public static void main(String[] args) {
		//wordrepitationcount("Ram is a very very good boy");
		//repitationofwords("ram is a very very good boy");
		wordoccurences("ram is a very very good boy");
	}
}
