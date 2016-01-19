package Release_VIII.A_Chapter_8.R14_Abs_Figure;

abstract public class Figure {
	private double a, b;
	
	Figure(double a, double b) {
		this.a = a;
		this.b = b;
	}

	abstract double area();
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
}
