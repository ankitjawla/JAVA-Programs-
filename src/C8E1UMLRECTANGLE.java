import java.text.DecimalFormat;

public class C8E1UMLRECTANGLE {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("Details of the 1st rectangle...");
		System.out.println("Width of Rectangle1: " + rectangle1.width);
		System.out.println("Height of Rectangle1: " + rectangle1.height);
		System.out.println("Area of Rectangle1: "
				+ df.format(rectangle1.getArea()));
		System.out.println("Perimeter of Rectangle1:"
				+ rectangle1.getPerimeter());
		System.out.println();
		System.out.println("Details of the 2nd rectangle...");
		System.out.println("Width of Rectangle2: " + rectangle2.width);
		System.out.println("Height of Rectangle2: " + rectangle2.height);
		System.out.println("Area of Rectangle2: "
				+ df.format(rectangle2.getArea()));
		System.out.println("Perimeter of Rectangle2: "
				+ rectangle2.getPerimeter());
	}
}

class Rectangle {

	double width = 1.0;
	double height = 1.0;

	Rectangle() {

	}

	Rectangle(double newWidth, double newHeight)

	{
		width = newWidth;
		height = newHeight;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return 2 * (width + height);
	}
}
