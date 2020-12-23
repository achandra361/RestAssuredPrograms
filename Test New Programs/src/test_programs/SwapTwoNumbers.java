package test_programs;

public class SwapTwoNumbers {
	public void swapnumbers(int i , int j) {
		i= i+j;
		j=i-j;
		i=i-j;
		System.out.println(i+" "+j);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapTwoNumbers s = new SwapTwoNumbers();
		s.swapnumbers(10, 20);
		
		
		
	}

}
