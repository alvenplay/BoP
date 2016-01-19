package Release_VIII.A_Chapter_6.P5_Box_Demo_5;

public class Box {
	double height;
	double depth;
	double width;
	
	double volume() {
		return this.width * this.depth * this.height;
	}
	
	void setDim(double width, double height, double depth) {
		this.height = height;
		this.depth = depth;
		this.width = width;
	}
}
