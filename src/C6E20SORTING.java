import java.util.Scanner;


public class C6E20SORTING {
	
	
	public static void sortedlist(double [] temp){
		double mom = 0;
		int loc =0;
		for(int j=0;j<temp.length-1;j++){
		double large = temp[0];
		loc =0;
		
		for(int i = 1; i < temp.length-j; i++){
			if(large<temp[i]){
				large = temp[i];
				 loc = i;
			}
		}
			mom = temp[temp.length-j-1];
			temp[temp.length-j-1]=large;
			temp[loc]=mom;
				
	}
		System.out.println("List After Sorting is");
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double [] d1 = new double[10];
		System.out.println("enter ten numbers");
		for(int i = 0; i<d1.length;i++){
			d1[i] = input.nextDouble();
		}
		sortedlist(d1);
	}

}
