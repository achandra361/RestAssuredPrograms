package Test_Programs_advanced;

public class FirstNonrepeating {
	
	public static char firstrepeatingcharacter(String input) {
		char[] count = new char[256];
		int index=-1;
		for(int i=0;i<input.length();i++) {
			count[input.charAt(i)]++;
		}
		
		for(int i=0;i<input.length();i++) {
			if(count[input.charAt(i)]==1) {
				index=i;
				break;
			}
		}
		return input.charAt(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aappllle";
		System.out.println(firstrepeatingcharacter(input));
	}
		

}
