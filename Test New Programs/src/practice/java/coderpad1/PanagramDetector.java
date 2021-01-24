package practice.java.coderpad1;

import java.util.Set;
import java.util.TreeSet;

public class PanagramDetector {
	
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	  public String findMissingLetters(String sentence) {
		  
		  if(sentence.isEmpty()) {
			  System.out.println("Wrong Argument");
		  }
		  Set<Character> set = new TreeSet<>();
		  for(Character c:ALPHABET.toCharArray()) {
			  set.add(c);
		  }
		  StringBuilder sb = new StringBuilder();
		  String str = sentence.toLowerCase();
		  for(Character missing:str.toCharArray()) {
			  set.remove(missing);
		  }
		  for(Character letter:set) {
			  sb.append(letter);
		  }
	    return sb.toString();
	    
	  }

	  

	  public static void main(String[] args) {
	  PanagramDetector pd = new PanagramDetector();
	  boolean success = true;

	  success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
	  success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

	  if (success) {
	    System.out.println("Pass ");
	  } else {
	    System.out.println("Failed");
	  }
	  }

}
