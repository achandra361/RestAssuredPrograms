package java_advanced_programs;

import java.util.Set;
import java.util.TreeSet;

public class PanagramDetectorProgram{
	
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	  public String findMissingLetters(String sentence) {
		Set<Character> set = new TreeSet<>();
		if(sentence.length()==0) {
			System.out.println("Incorrect Argument");
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ALPHABET.length();i++) {
			set.add(ALPHABET.charAt(i));
		}
		String str = sentence.toLowerCase();
		for(int i=0;i<str.length();i++) {
			set.remove(str.charAt(i));
		}
		for(Character missing:set) {
			sb.append(missing.charValue()).append(" ");
		}
		
	    return sb.toString();
	  }

	  public static void main(String[] args) {
	  PanagramDetectorProgram pd = new PanagramDetectorProgram();
	  String sentence = "ANimesh is a nice techie";
	  System.out.println(pd.findMissingLetters(sentence));
	  }
}
