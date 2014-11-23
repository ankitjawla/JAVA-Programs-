import java.awt.geom.Line2D;
import java.util.*;

public class C8E11Geometricintersection {

	static void getLineLineIntersection(Line2D l1, Line2D l2) {
		double x1 = l1.getX1(), y1 = l1.getY1(), x2 = l1.getX2(), y2 = l1
				.getY2(), x3 = l2.getX1(), y3 = l2.getY1(), x4 = l2.getX2(), y4 = l2
				.getY2();
		double intersectionX = det(det(x1, y1, x2, y2), x1 - x2,
				det(x3, y3, x4, y4), x3 - x4)
				/ det(x1 - x2, y1 - y2, x3 - x4, y3 - y4);
		double intersectionY = det(det(x1, y1, x2, y2), y1 - y2,
				det(x3, y3, x4, y4), y3 - y4)
				/ det(x1 - x2, y1 - y2, x3 - x4, y3 - y4);
		if (Double.isNaN(intersectionX) && Double.isNaN(intersectionY)) {
			System.out.println("Lines do not intersect at any pt. ");
		} else {
			System.out.println("Intersecting pt is : " + "(" + intersectionX
					+ "," + intersectionY + ")");
		}
	}

	static double det(double a, double b, double c, double d) {
		return a * d - b * c;
	}

	public static void main(String[] args) {
		Line2D l1;
		Line2D l2;
		System.out.print(" Enter the endpoints of the 1st line segment : ");
		Scanner input = new Scanner(System.in);
		String pointsString = null;
		String[] temp1 = null;
		pointsString = input.nextLine();
		temp1 = pointsString.split(" ");

		if (temp1.length != 4) {
			System.out
					.println("The endpoints have been entered incorrectly, Program will Exit. ");
			System.exit(0);
		}
		System.out.print("Enter the endpoints of the 2nd line segment : ");
		Scanner input1 = new Scanner(System.in);
		pointsString = null;
		String[] temp2 = null;
		pointsString = input1.nextLine();
		temp2 = pointsString.split(" ");
		if (temp2.length != 4) {
			System.out
					.println("The endpoints have been entered incorrectly, Program will Exit. ");
			System.exit(0);
		}

		double a = Double.parseDouble(temp1[0]);
		double b = Double.parseDouble(temp1[1]);
		double c = Double.parseDouble(temp1[2]);
		double d = Double.parseDouble(temp1[3]);
		double e = Double.parseDouble(temp2[0]);
		double f = Double.parseDouble(temp2[1]);
		double g = Double.parseDouble(temp2[2]);
		double h = Double.parseDouble(temp2[3]);
		l1 = new Line2D.Double(a, b, c, d);
		l2 = new Line2D.Double(e, f, g, h);
		C8E11Geometricintersection.getLineLineIntersection(l1, l2);
	}
}
