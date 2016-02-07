package Release_VIII.A_Chapter_8.P4_Refer;

public class Std_Box {
	double width, height, depth;
	
	public Std_Box() {
		this.width = -1;
		this.height = -1;
		this.depth = -1;
	}
	
	public Std_Box(Std_Box ob) {
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}
	
	public Std_Box(double len) {
		this.width = this.depth = this.height = len;
	}
	
	public Std_Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double vol() {
		return width*height*depth;
	}

}
