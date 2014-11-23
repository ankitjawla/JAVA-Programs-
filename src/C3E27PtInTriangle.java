import java.util.Scanner;


public class C3E27PtInTriangle {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x and y coordinates");
		double x = input.nextDouble();
		double y = input.nextDouble();
		// x1=0,x2=200,x3=0
		// y1=0,y2=0  ,y3=100
		double y23 = -100;
		double x32 = -200;
		double y31 = 100;
		double x13 = 0;
		double det = 20000;
		double minD = Math.min(det,0);
		double maxD = Math.max(det, 0);
		double dx = x;
		double dy = y - 100;
		double a = -100 * x + -200 * dy;
		 if (a < minD || a > maxD){
			 System.out.println("pt is not in the triangle");
	         System.exit(1); 
		 }
	        double b = 100 * dx + 0 * dy;
	        if (b < minD || b > maxD){
	          System.out.println("pt is not in the triangle");
	          System.exit(1); }
	        double c = det - a - b;   
	        if (c < minD || c > maxD){
	          System.out.println("pt is not in the triangle");
	          System.exit(1); }
	        System.out.println("pt is in the triangle");

	}

}
