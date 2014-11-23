
public class C4E10DIVISIBLEby5AND6 {
	
	public static void main(String[] args) {

		System.out.println("No. Divisible by 5 and 6 :");
		int count = 0;
		for(int i = 100;i <= 1000; i++){
			if ( i % 5 == 0 && i % 6 == 0){
				count++;
				System.out.print(i+" ");
							}
			if(count == 10){
				System.out.println();
				count = 0;
		   }
	}
}}

