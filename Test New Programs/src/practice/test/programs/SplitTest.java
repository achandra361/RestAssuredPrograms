package practice.test.programs;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ram is a good ,boy.and";
		for(String str:s.split("[,. ]")) {
			System.out.println(str);
		}

	}

}
