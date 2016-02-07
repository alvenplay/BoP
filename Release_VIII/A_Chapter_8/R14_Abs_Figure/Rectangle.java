package Release_VIII.A_Chapter_8.R14_Abs_Figure;

public class Rectangle extends Figure{
	Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.println("Wewnatrz metody area z Rectangle.");
		return getA() * getB();
	}
}
