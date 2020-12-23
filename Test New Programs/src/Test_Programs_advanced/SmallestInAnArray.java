package Test_Programs_advanced;

public class SmallestInAnArray {
	
	public static int smallestinanarraygiven(int[] arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		try {
			return arr[1];
		}catch(Exception e){
			return arr[0];
		}
	}
	public static void main(String[] args) {
		int[] arr= {7,8,1};
		System.out.println(smallestinanarraygiven(arr));
	}

}
