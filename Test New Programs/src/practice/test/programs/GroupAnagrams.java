package practice.test.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	static String input = "cat dog tac sat tas god dog";
	  
	  static void setOfAnagrams(String input){ 
	    HashMap<String , List<String>> map = new HashMap<>();
	    //your code goes here
		  for(String s:input.split(" ")) {
			  char[] c = s.toCharArray();
			  Arrays.sort(c);
			  String newword = new String(c);
			  
			  if(map.containsKey(newword)) {
				  map.get(newword).add(s);
				  //System.out.println(map);
			  }
			  
			  else
			  {
				  List<String> words = new ArrayList<>();
				  words.add(s);
				  map.put(newword, words);
			  }
			  
		  }
		  StringBuilder sb = new StringBuilder();
		  for(String str:map.keySet()) {
			  List<String> values = map.get(str);
			  for(String word:values) {
				  sb.append(word+" ");
			  }
			 
		  }
		  System.out.println(sb.toString());
		  
	    
	    
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    String input = "cat dog tac sat tas god dog";
	    setOfAnagrams(input);
	    
	  }
}
