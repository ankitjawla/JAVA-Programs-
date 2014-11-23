import java.util.Scanner;


public class C6E9AND10SMALLEST {
	
	public static double findMin(double []test){
		double min = test[0];
		for(int i = 1; i < test.length;i++){
			if (min>test[i])
				min = test[i];
			
		}
		return min;
	}
	
	public static void main(String[] args) {
  
	Scanner input = new Scanner(System.in);	
		double smallest;
		double []doubleArray = new double[10]; 
		System.out.println("ENTER TEN No's");
		for(int i = 0; i < doubleArray.length;i++){
			doubleArray[i] = input.nextDouble();
		}
		
		smallest = findMin(doubleArray);
		System.out.println("The Minimum no. is: "+smallest);
		for(int i = 0; i < doubleArray.length;i++){
			if (smallest == doubleArray[i]){
				System.out.println("index is: "+i);
				break;
			}
		}
	}

}



