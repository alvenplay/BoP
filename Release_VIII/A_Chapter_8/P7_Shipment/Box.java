package Release_VIII.A_Chapter_8.P7_Shipment;

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
	
	Box(double width, double depth, double height) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double vol() {
		return width * height * depth;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}
}
