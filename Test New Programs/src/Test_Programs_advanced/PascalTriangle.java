package Test_Programs_advanced;

public class PascalTriangle {
	
	public static void printpascal(int row) {
		int spaces = row;
		int number = 1;
		for(int i=0;i<row;i++){
		     
		      for(int s=0;s<spaces;s++){
		        System.out.print(" ");
		      }
		      number =1;
		      for(int j=0;j<=i;j++){
		           System.out.print(number + " ");
		           number = number * (i-j)/(j+1) ;
		           
		      }
		      spaces--;
		System.out.println();      
		}
		    
		  }
	public static void main(String[] args) {
		 printpascal(4);
	}
	}


