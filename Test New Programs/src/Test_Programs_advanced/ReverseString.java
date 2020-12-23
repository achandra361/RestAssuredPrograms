package Test_Programs_advanced;

public class ReverseString {
	
	public static String stringreverse(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse = reverse + input.charAt(i);
			
		}
		return reverse;
	}
	
	public static String reverseeachword(String input) {
		
		String reverse="";
		for(String s :input.split(" ")) {
			
			for(int i = s.length()-1;i>=0;i--) {
				reverse = reverse + s.charAt(i);
				
			}
			reverse = reverse + " ";
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "animesh";
		String str = "My name is Animesh";
		System.out.println(stringreverse(input));
		System.out.println(reverseeachword(str));

	}

}
