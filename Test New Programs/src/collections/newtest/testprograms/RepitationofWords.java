package collections.newtest.testprograms;

public class RepitationofWords {
	
	public static void RepitationofWordsinSentence(String input) {
		
		
		String words = input.toLowerCase();
		String[] word = words.split(" ");
		for(int i=0;i<word.length;i++) {
			int count =1;
			for(int j=i+1;j<word.length;j++) {
				
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
			}
			if(count>0 && word[i]!="0") {
				System.out.println(count+" "+ word[i]);
		}
		
		}
	}
	public static void main(String[] args) {
		String input = "Ram is a very very good boy";
		RepitationofWordsinSentence(input);
	}

}
