package Release_VIII.A_Chapter_8.R12_Figure;

public class Demo {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		
		System.out.println("Pole: " +f.area() + "\n");
		System.out.println("Pole: " +r.area() + "\n");
		System.out.println("Pole: " +t.area() + "\n");
		
	}

}
