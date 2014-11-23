import java.util.Scanner;


class C2E3Covertfeetintometers {
	public static void main(String[] args)
	{
		// declare scanner object
		Scanner input = new Scanner(System.in);
		//prompt user for input
		System.out.print("Enter a value of feet : ");
		//accept user input
		double feet = input.nextDouble();
		// compute conversion
		double meters = feet * 0.305;
		//display output
		System.out.println( feet + " feet is " + meters + " meters");
	}
}
