package Test_Programs_advanced;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PanagramDetector {
	
	private static final String Alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public static String PanagramsinSentence(String input) {
		SortedSet<Character> s = new TreeSet<Character>();
		for(int i=0;i<Alphabet.length();i++) {
			s.add(Alphabet.charAt(i));
		}
		
		String str = input.toLowerCase();
		for(int i=0;i<str.length();i++) {
			s.remove(str.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character c:s) {
			sb.append(c.charValue());
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		System.out.println(PanagramsinSentence(input));
	}
}
