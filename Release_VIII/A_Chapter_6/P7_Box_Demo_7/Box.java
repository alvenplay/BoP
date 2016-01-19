package Release_VIII.A_Chapter_6.P7_Box_Demo_7;

public class Box {
	double width;
	double height;
	double depth;
	
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return this.depth * this.width * this.height;
	}
}
