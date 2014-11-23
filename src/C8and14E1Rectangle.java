import java.util.Scanner;

public class C8and14E1Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter width of the rectangle");
		double w = input.nextDouble();
		System.out.println("Enter height of the rectangle");
		double h = input.nextDouble();

		try {
			C8and14E1Rectangle_Definition r2 = new C8and14E1Rectangle_Definition(
					w, h);

			System.out.println("Area of rectanle of width " + w
					+ " and height " + h + " is: " + r2.getArea());
			System.out.println("Perimeter of the rectangle " + "of width " + w
					+ " and height " + h + " is: " + r2.getPerimeter());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class C8and14E1Rectangle_Definition {

	private double height = 1;
	private double width = 1;
	private String errorMessage = " ";

	public C8and14E1Rectangle_Definition() {

	}

	public C8and14E1Rectangle_Definition(double w, double h) throws Exception 
	{
		setWidth(w);
		setHeight(h);
	}

	public double getHeight() 
	{
		return height;
	}

	public double getWidth() 
	{
		return width;
	}

	public String getErrorMessage() 
	{
		return errorMessage;
	}
	public boolean isValidHeight(double h1) {
		if (h1 < 0) {
			errorMessage = "Invalid input: Height can't be negative";
			return false;
		} else
			return true;
	}
	public boolean isValidWidth(double w1) {
		if (w1 < 0) {
			errorMessage = "Invalid input: Width can't be negative";
			return false;
		}

		else
			return true;
	}

	public void setHeight(double height) throws Exception {

		if (!isValidHeight(height)) {
			Exception e = new Exception(errorMessage);
			throw e;
		}
		this.height = height;
	}

	public void setWidth(double width) throws Exception {

		if (!isValidWidth(width)) {
			Exception e = new Exception(errorMessage);
			throw e;
		}
		this.width = width;
	}

	public double getArea() throws IllegalArgumentException {
		if (width >= 0 && height >= 0)
			return width * height;
		else
			throw new IllegalArgumentException("Width or Height cannot be negative");
	}

	public double getPerimeter() throws IllegalArgumentException {
		if (width >= 0 && height >= 0)
			return 2 * (width + height);
		else
			throw new IllegalArgumentException("Width or Height cannot be negative");
	}}