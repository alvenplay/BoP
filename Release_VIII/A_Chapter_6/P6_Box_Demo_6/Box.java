package Release_VIII.A_Chapter_6.P6_Box_Demo_6;

public class Box {
	double width;
	double height;
	double depth;
	
	Box() {
		System.out.println("Konstruktor Box");
		this.width = 10;
		this.height = 20;
		this.depth = 15;
	}
	
	double volume() {
		return this.depth * this.width * this.height;
	}
}
