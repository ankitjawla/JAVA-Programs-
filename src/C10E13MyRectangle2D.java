
import java.util.Scanner;


public class C10E13MyRectangle2D {

	public static void main(String[] args) {
		double x = 0, y = 0, width = 1.0, height = 1.0;
		MyRectangle2D r1 = new MyRectangle2D(x, y, width, height);
		System.out.println("Enter the center co-ordinates(x, y) for the 1st Rectangle");

		Scanner input = new Scanner(System.in);
		r1.setX(input.nextDouble());
		r1.setY(input.nextDouble());
		System.out.println("\nEnter the Width and Height for the 1st rectangle");
		r1.setWidth(input.nextDouble());
		r1.setHeight(input.nextDouble());

		boolean check = true;
		while (check) {
			MyRectangle2D rect = new MyRectangle2D(x, y, width, height);

			System.out.println("\nEnter x, y to check whether pt lies inside the rectangle: ");
			Scanner input2 = new Scanner(System.in);
			rect.setX(input2.nextDouble());
			rect.setY(input2.nextDouble());

			MyRectangle2D r2 = new MyRectangle2D(x, y, width, height);
			System.out.println("\n Enter center co-ordinates(x, y) for the 2nd Rectangle");
			Scanner input3 = new Scanner(System.in);
			r2.setX(input3.nextDouble());
			r2.setY(input3.nextDouble());
			System.out.println("\nEnter Width and Height for the 2nd rectangle");
			r2.setWidth(input3.nextDouble());
			r2.setHeight(input3.nextDouble());

			System.out.println("\nArea of the 1st rectangle is "
					+ (int)(r1.getArea() * 100) / 100.0);
			System.out.println("\nPerimeter of the 1st rectangle is "
					+ (int)(r1.getPerimeter() * 100) / 100.0);
			System.out.println("\nIs the point inside in the 1st rectangle?  "
							+ r1.contains(rect.getX(), rect.getY()));
			System.out.println("\n 2nd rectangle inside the first one?  "
							+ r1.contains(r2));
			System.out.println("\n 2nd rectangle overlap the first one?  "
							+ r1.overlaps(r2));

			Scanner input1 = new Scanner(System.in);
			int Int = input1.nextInt();
			if (Int != 1) {
				check = false;
				System.exit(0);
			}
		}
	}
}

class MyRectangle2D {
	private double x, y; 
	private double width, height;

	public MyRectangle2D() {
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public double getArea() {
		return width * height;
	}

	public boolean contains(double x, double y) {
		return Math.abs(x - this.x) <= width / 2
				&& Math.abs(y - this.y) <= height / 2;
	}

	public boolean contains(MyRectangle2D r) {
		return contains(r.x - r.width / 2, r.y + r.height / 2)
				&& contains(r.x - r.width / 2, r.y - r.height / 2)
				&& contains(r.x + r.width / 2, r.y + r.height / 2)
				&& contains(r.x + r.width / 2, r.y - r.height / 2);
	}

	public boolean overlaps(MyRectangle2D r) {
		return Math.abs(this.x - r.x) <= (this.width + r.width) / 2
				&& Math.abs(this.y - r.y) <= (this.height + r.height) / 2;
	}

}


	
