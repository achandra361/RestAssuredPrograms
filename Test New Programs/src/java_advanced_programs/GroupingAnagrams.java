package java_advanced_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupingAnagrams {
	static String input = "cat dog tac sat tas god dog";
	  
	  static void setOfAnagrams(String inputString){ 
	    
	    //your code goes here
		  HashMap<String,List<String>> map = new HashMap<>();
		  if(inputString.length()==0) {
			  System.out.println("Invalid Argument");
		  }
		  for(String s:inputString.split(" ")) {
			  char[] word= s.toCharArray();
			  Arrays.sort(word);
			  String newword = new String(word);
			  
			  if(map.containsKey(newword)) {
				  map.get(newword).add(s);
			  }
			  else {
				  List<String> words = new ArrayList<>();
				  words.add(s);
				  map.put(newword, words);
			  }
		  }
		  StringBuilder sb = new StringBuilder();
		  for(String s:map.keySet()) {
			  List<String> l=map.get(s);
			  for(String str:l) {
				  sb.append(str+" ");
			  }
		  }
		  System.out.println(sb.toString());
		  
	    
	    
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    String input = "cat dog tac sat tas god dog";
	    setOfAnagrams(input);
	    
	  }

}
