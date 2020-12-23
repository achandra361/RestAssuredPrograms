package Practice_problems2;

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
		  for(String entry:entries) {
			  String sortedletter = Stream.of(entry.split("")).sorted().collect(Collectors.joining());
			  map.computeIfAbsent(sortedletter, list -> new LinkedList<String>());
			  map.get(sortedletter).add(entry);
		  }
	  }
	  public List<String> list(String sortedletter){
		  return map.get(sortedletter);
	  }

	  public boolean contains(String word) {
	    return Arrays.asList(entries).contains(word);
	  }
	}

public class DictionaryProblem {
	public static Set<String> combination(Set<String> lettersCombination){
		Set<String> oneletterset = new HashSet<>();
		for(String letter :lettersCombination) {
			if(letter.length()>1) {
				for(int i=0;i<letter.length();i++) {
					oneletterset.add(letter.substring(0,i) + letter.substring(i+1, letter.length()));
				}
			}
		}
		return oneletterset ;
	}
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
