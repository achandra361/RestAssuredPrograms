package test_programs;

public class FibbonacciSeries {
	
	public void fibbonacci(int n) {
		int first = 0;
		int second = 1;
		int next ;
		System.out.println(first);
		System.out.println(second);
		while(n-2>0) {
			next = first + second ;
			System.out.println(next);
			first= second;
			second= next;
			n--;
		}
	}
	public static void main(String[] args) {
		FibbonacciSeries f = new FibbonacciSeries();
		f.fibbonacci(10);
	}
}
