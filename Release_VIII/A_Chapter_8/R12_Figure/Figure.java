package Release_VIII.A_Chapter_8.R12_Figure;

public class Figure {
	private double a, b;
	
	Figure(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	double area() {
		System.out.println("Pole figury nie jest zdefiniowane.");
		return 0;
	}
	
	double getA() {
		return a;
	}
	
	double getB() {
		return b;
	}
}
