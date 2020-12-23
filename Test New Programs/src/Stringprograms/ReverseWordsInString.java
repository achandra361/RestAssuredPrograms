package Stringprograms;

public class ReverseWordsInString {
	
	public static void reversestring(String s) {
		char reverse;
		String rev = "";
		for(String str:s.split(" ")) {
			for(int i=str.length()-1;i>=0;i--) {
				reverse= str.charAt(i);
				rev = rev + reverse;
			}
			rev = rev+" "; 
		}
		System.out.println(rev);
		
	
	}
	public static void main(String[] args) {
		reversestring("This is a string");
	}
}
