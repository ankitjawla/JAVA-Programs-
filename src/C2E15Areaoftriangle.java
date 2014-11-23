import java.util.Scanner;


class C2E15Areaoftriangle {
	public static void main(String[] args )
	{
		//Create Scanner Object
		Scanner input = new Scanner(System.in);
				System.out.print("Enter three points (P(x and y)) for a triangle: ");
				double x1 = input.nextDouble();
				double y1 = input.nextDouble();
				double x2 = input.nextDouble();
				double y2 = input.nextDouble();
				double x3 = input.nextDouble();
				double y3 = input.nextDouble();
				double s1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
				double s2 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
				double s3 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
				double s = (s1 + s2 + s3)/2;
				double area = Math.pow(s * (s- s1) * (s - s2) * (s - s3), 0.5);

	System.out.println("The area of the triangle is " + area);
	}
	}
