import java.util.Scanner;


public class C3E3LINEAREQUATION {public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a, b, c, d, e, f:");
	double a= input.nextDouble();
	double b= input.nextDouble();
	double c= input.nextDouble();
	double d= input.nextDouble();
	double e= input.nextDouble();
	double f= input.nextDouble();
	
	if (a * d - b * c ==0)
		System.out.println("Equation has no solution");
	else{
		double A = (e * d - b * f)/(a * d - b * c);
		double B = (a * f - e * c)/(a * d - b * c);
		
		System.out.println("A is "+A+" and B is "+B);
		}}}
