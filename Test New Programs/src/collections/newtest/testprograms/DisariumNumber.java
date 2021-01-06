package collections.newtest.testprograms;

public class DisariumNumber {
	public static int length(int x) {
		int length =0;
		while(x!=0) {
			length =length+1;
			x=x/10;
		}
		return length;
		
	}
	public static void DisariumNumberCheck(int x) {
		
	//System.out.println(length);
		int dis_num =0;
		int length = length(x);
		int n=x;
		while(x>0) {
			int rem = x%10;
			dis_num= dis_num+(int)Math.pow(rem, length);
			x=x/10;
			length--;
		}
		System.out.println(dis_num);
		if(n == dis_num) {
			System.out.println("It is a disarium Number");
		}
		else 
			System.out.println("Not a disarium Number");
	}
	public static void main(String[] args) {
		DisariumNumberCheck(89);
	}

}
