package Release_VIII.A_Chapter_8.R12_Figure;

public class Triangle extends Figure {
	
	Triangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("In Triangle");
		return getA() * getB() / 2;
	}
}
