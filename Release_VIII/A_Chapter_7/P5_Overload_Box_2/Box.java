package Release_VIII.A_Chapter_7.P5_Overload_Box_2;

public class Box {
	double width;
	double height;
	double depth;
	
	Box() {
		this.width = -1;
		this.height = -1;
		this.depth = -1;
	}
	
	Box(double length) {
		this.width = this.height = this.depth = length;
	}
	
	Box(Box obj) {
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
	}
	
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return this.width * this.depth * this.height;
	}
}
