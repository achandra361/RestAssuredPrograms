package java_important_programs;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
	
	//reverse the given string 
	public static String stringreverse(String input) {
		String reverse = "";
		for(int i = input.length()-1;i>=0;i--) {
			reverse = reverse + input.charAt(i);
		}
		return reverse;
	}
	
	//reverse whole sentence
	public static String reversesentence(String input) {
		String sentence = "";
		for(String str:input.split(" ")) {
			sentence = sentence + stringreverse(str)+" ";
		}
		
		return sentence;
	}
	public static boolean anagramscheck(String input,String input2) {
		char[] c = input.toCharArray();
		Arrays.sort(c);
		String str = new String(c);
		char[] d = input2.toCharArray();
		Arrays.sort(d);
		String str2 = new String(d);
		if(str.equals(str2)) {
			return true;
		}else
		return false;
	}
	public static void main(String[] args) {
		String input = "Dean";
		String sentence = "Dean is a ghost Hunter";
		String name = "eDan";
		System.out.println(stringreverse(input));
		System.out.println(reversesentence(sentence));
		System.out.println(anagramscheck(input, name));
	}
}
