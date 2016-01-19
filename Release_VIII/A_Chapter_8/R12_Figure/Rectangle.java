package Release_VIII.A_Chapter_8.R12_Figure;

public class Rectangle extends Figure {
	
	Rectangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("In Rectangle");
		return getA() * getB();
	}
}
