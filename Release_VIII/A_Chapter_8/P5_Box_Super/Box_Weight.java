package Release_VIII.A_Chapter_8.P5_Box_Super;

public class Box_Weight extends Box{
	double weight;
	
	public Box_Weight() {
		super();
		weight = -1;
	}
	
	public Box_Weight(Box_Weight ob) {
		super(ob);
		this.weight = ob.weight;
	}
	
	public Box_Weight(double len, double weight) {
		super(len);
		this.weight = weight;
	}
	
	public Box_Weight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}
}
