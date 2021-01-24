package practice.java.coderpad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	static String input = "cat dog tac sat tas god dog";
	  
	  static void setOfAnagrams(String inputString){ 
	    
	    //your code goes here
		  Map<String,List<String>> map = new HashMap<>();
		  for(String str:inputString.split(" ")) {
			  char[] c = str.toCharArray();
			  Arrays.sort(c);
			  String s = new String(c);
			  if(map.containsKey(s)) {
				  map.get(s).add(str);
			  }
			  else {
				  List<String> l = new ArrayList<>();
				  l.add(str);
				  map.put(s, l);
			  }
		  }
			  StringBuilder sb = new StringBuilder();
			  for(String word:map.keySet()) {
				  List<String> values = map.get(word);
				  for(String words:values){
					  sb.append(words+" ");
				  }
			  }
			  System.out.println(sb.toString());
		  }
	    
	  
	  
	  
	  public static void main(String[] args) {
	    
	    String input = "cat dog tac sat tas god dog";
	    setOfAnagrams(input);
	    
	  }
}
