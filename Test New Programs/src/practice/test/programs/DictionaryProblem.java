package practice.test.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


	class Dictionary {
			private String[] entries;
		  private Map<String , List<String>> map = new HashMap<>();
		  

		  public Dictionary(String[] entries) {
		    for(String str: entries) {
		    	String letter = Stream.of(str.split("")).sorted().collect(Collectors.joining());
		    	map.computeIfAbsent(letter, list ->new LinkedList<String>());
		    	map.get(letter).add(str);
		    }
		  }
		  public List<String> list(String letter){
			  return map.get(letter);
		  }

		  public boolean contains(String word) {
		    return Arrays.asList(entries).contains(word);
		  }
		}
	public class DictionaryProblem {
		
		  public static Set<String> longestWord(String letters, Dictionary dict) {
		    Set<String> result = new HashSet<String>();
		    if (dict.contains(letters)) {
		      result.add(letters);
		    }
		    return result;
		  }


		  public static boolean pass() {
		    Dictionary dict = new Dictionary(new String[]{"to", "toe", "toes", "doe", "dog", "god", "dogs", "banana"});
		    boolean r = new HashSet<String>(Arrays.asList("toe")).equals(longestWord("toe", dict));
		    return r;
		  }

		  public static void main(String[] args) {
		    if(pass()) {
		      System.out.println("Pass");
		    } else {
		      System.err.println("Fails");
		    }
		  }
}
