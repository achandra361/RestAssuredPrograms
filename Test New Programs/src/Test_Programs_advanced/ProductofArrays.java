package Test_Programs_advanced;

public class ProductofArrays {
	
	public static int dotproduct(int[] array1,int[] array2) 
			throws IllegalArgumentException {
		if(array1 == null || array2 == null) {
			throw  new IllegalArgumentException("Input is incorrect");
		}
		int sum = 0;
		for(int i =0;i<array1.length;i++) {
			sum = sum + array1[i] * array2[i];
		}
		return sum;
	}
	
	public static  int multiplyproduct(int[] array1, int[] array2) 
			throws IllegalArgumentException{
		if(array1 == null || array2 == null) {
			throw  new IllegalArgumentException("Input is incorrect");
		}
		int sum = 0;
		for(int i =0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				sum = sum +array1[i]*array2[j];
			}
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[] array1= {1,2};
		int[] array2 = {2,3};
		System.out.println(dotproduct(array1, array2));
		System.out.println(multiplyproduct(array1, array2));
	}

}
