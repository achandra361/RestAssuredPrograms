package collections.newtest.testprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentMarksPrograms {
	
	public static void markswithroll(int roll,int[] marks) {
		Map<Set<Integer>,ArrayList<Integer>> map = new HashMap<>();
		Set<Integer> set = new TreeSet<>();
		set.add(roll);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(Integer i:marks) {
			al.add(i);
		}
		map.put(set, al);
		StringBuilder sb = new StringBuilder();
		for(Set<Integer> s:map.keySet()) {
			for(int i:s) {
				sb.append(i+"--");
				ArrayList<Integer> l = map.get(s);
				for(int mar:l) {
					sb.append(mar+", ");
				}

			}
		}
		System.out.println(sb.toString());
			
	}
	public static void main(String[] args) {
		//int roll = 3;
		//int[] marks = {78,98,87,89,99};
		int[] marks = new int[5];
		//int n=5;
		//ArrayList<Integer> marks = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number of Student");
		int roll = sc.nextInt();
		
		System.out.println("Enter marks of Student");
		//n= sc.nextInt();
		for(int i=0;i<5;i++) {
			
			marks[i]= sc.nextInt();
		}
		markswithroll(roll, marks);
	}

}
