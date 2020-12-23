package Test_Programs_advanced;

public class Lengthencoding {
	
	public static String lengthencode(String input) {
		if(input.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		char seen = 0;
		int count =1;
		for(int i = 0;i<input.length();i++) {
			char current = input.charAt(i);
			if(seen == current) {
				count++;
			}else {
				if(seen !=0) {
					sb.append(seen).append(count);
				}
				count = 1;
				seen = current;
			}
		}
		sb.append(seen).append(count);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String input = "abbbaaccc";
		System.out.println(lengthencode(input));
				
	}

}
