package practice.test.programs;

import java.util.Set;
import java.util.TreeSet;

public class PanagramDetector {
		  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

		  public static String findMissingLetters(String sentence) {
			  if(sentence.length()==0) {
				  System.out.println("Invalid Argument");
			  }
			  Set<Character> s = new TreeSet<>();
			  for(int i =0;i<ALPHABET.length();i++) {
				  s.add(ALPHABET.charAt(i));
			  }
			  String str = sentence.toLowerCase();
			  StringBuilder sb = new StringBuilder();
			  for(int i =0;i<str.length();i++) {
				  s.remove(str.charAt(i));
			  }
			  for(Character c:s) {
					  sb.append(c.charValue());
			  }
		    return sb.toString();
		  }

		  

		  public static void main(String[] args) {
		  //PanagramDetector pd = new PanagramDetector();
		  boolean success = true;

		  success = success && "".equals(findMissingLetters("The quick brown fox jumps over the lazy dog"));
		  success = success && "abcdefghijklmnopqrstuvwxyz".equals(findMissingLetters(""));

		  if (success) {
		    System.out.println("Pass ");
		  } else {
		    System.out.println("Failed");
		  }
		  }

}
