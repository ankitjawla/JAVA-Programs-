import java.util.Scanner;

public class C4E9HIGHESTSCORES {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter No of Students");
		int number = input.nextInt();
		String [] names = new String[number];
		Double [] scores = new Double[number];
		double highest = 0.0, secondHighest = 0.0;
		int iteration = 0,secondIteration = 0;
		for(int i = 0;i < number;i++){
			System.out.println("Enter the Name of the Student");
			names[i] = input.next();
			System.out.println("Enter the Score");
			scores[i] = input.nextDouble();
				
			if (highest < scores[i]){
				secondHighest = highest;
				secondIteration = iteration;
				highest = scores[i];
				iteration = i;
			    }
			else if(highest > scores[i] && secondHighest < scores[i]){
				secondHighest = scores[i];
				secondIteration = i;
				
			}
					}
System.out.println("Highest Score is: "+highest+" AND The Name of the Student is: "+names[iteration]);
System.out.println("Second Highest Score is: "+secondHighest+" and the Name of the Student is: "+names[secondIteration]);
	}

}
