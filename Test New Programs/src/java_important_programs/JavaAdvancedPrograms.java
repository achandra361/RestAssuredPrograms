package java_important_programs;

import java.util.ArrayList;

public class JavaAdvancedPrograms {
	
	public static char NonRepeatedCharacter(String input) {
		char[] c = new char[256];
		for(int i=0;i<input.length();i++) {
			c[input.charAt(i)]++;
		}
		int index = -1;
		for(int i=0;i<input.length();i++) {
			if(c[input.charAt(i)]==1) {
				index=i;
				break;
			}
		}
		return input.charAt(index);
		
	}
	
	public static ArrayList<Integer> arrayintersection(int[]a, int [] b) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					al.add(a[i]);
				}
			}
		}
		return al;
		
	}
	public static String removewhitespace(String input) {
		StringBuilder sb = new StringBuilder();
		for(String s:input.split(" ")) {
			sb.append(s);
		}
		return sb.toString();
	}
	
	public static int lengthofnumber(int num) {
		int count=0;
		while(num>0) {
			num = num/10;
			count++;
			
		}
		return count;
	}
	public static boolean armstrongnumber(int num) {
		int sum =0;
		int number = num;
		while(num>0) {
			int rem =0;
			rem = rem+num%10;
			sum = sum + (int)(Math.pow(rem, 3));
			num=num/10;
		}
		
		if(sum==number) {
			return true;
		}
		else
		return false;
	}
	public static void main(String[] args) {
		String s= "assarrrieii";
		System.out.println(NonRepeatedCharacter(s));
		int[] a = {1,4,6,2,8,9};
		int[] b = {1,4,6,77,2,90};
		System.out.println(arrayintersection(a, b));
		System.out.println(removewhitespace("Sam W inchester is a ni ce char acter"));
		System.out.println(lengthofnumber(16788765));
		System.out.println(armstrongnumber(371));
	}

}
