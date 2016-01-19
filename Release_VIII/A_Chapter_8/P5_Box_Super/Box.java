package Release_VIII.A_Chapter_8.P5_Box_Super;

public class Box {
	private double width, height, depth;
	
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(Box ob) {
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}
	
	Box(double len) {
		width = height = depth = len;
	}
	
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double vol() {
		return width * height * depth;
	}
}
