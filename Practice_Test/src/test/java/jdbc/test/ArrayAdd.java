package jdbc.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayAdd {
	
	public static ArrayList<Integer> addtwoarrays(int[] arr1,int[] arr2) {
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i:arr1) {
			al.add(i);
		}
		for(int i:arr2) {
			al.add(i);
		}
		return al;
		
	}
	
	public static Set<Integer> noduplicatearray(int[] arr1,int[] arr2){
		
		Set<Integer> set = new HashSet<>();
		for(int i:addtwoarrays(arr1, arr2)) {
			set.add(i);
		}
		return set;
		
	}
public static Set<Integer> noduplicatearrayascending(int[] arr1,int[] arr2){
		
		Set<Integer> set = new TreeSet<>();
		for(int i:addtwoarrays(arr1, arr2)) {
			set.add(i);
		}
		return set;
		
	}

public static Set<Integer> noduplicatearrayinsertionorder(int[] arr1,int[] arr2){
	
	Set<Integer> set = new LinkedHashSet<>(addtwoarrays(arr1, arr2));
	//for(int i:addtwoarrays(arr1, arr2)) {
		//set.add(i);
	//}
	return set;
	
}
	
	public static void main(String[] args) {
		int[] arr1= {3,5,56,7,78,9,91};
		int[] arr2= {7,3,2,1,4,56,6};
		System.out.println(addtwoarrays(arr1, arr2));
		System.out.println(noduplicatearray(arr1, arr2));
		System.out.println(noduplicatearrayascending(arr1, arr2));
		System.out.println(noduplicatearrayinsertionorder(arr1, arr2));
	}
}
