public class C10E4MyPoint {

	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(10, 30.5);
		p1.distance(p2);
		System.out.println("Distance between two points (0,0) and (10,30.5)= "
				+ Point.distance(p1, p2));
	}
}

class Point {
	private double x;
	private double y;

	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(Point secondPoint) {
		return distance(this, secondPoint);
	}

	public static double distance(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
				* (p1.y - p2.y));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
