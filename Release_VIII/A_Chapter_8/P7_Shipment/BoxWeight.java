package Release_VIII.A_Chapter_8.P7_Shipment;

public class BoxWeight extends Box{
	private double weight;
	
	public BoxWeight() {
		super();
		weight = -1;
	}
	
	public BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}
	
	public BoxWeight(double len, double weight) {
		super(len);
		this.weight = weight;
	}
	
	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
}
