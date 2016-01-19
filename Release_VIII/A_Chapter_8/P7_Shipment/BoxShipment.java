package Release_VIII.A_Chapter_8.P7_Shipment;

public class BoxShipment extends BoxWeight{
	private double cost;
	
	public BoxShipment() {
		super();
		cost = -1;
	}
	
	public BoxShipment(BoxShipment ob) {
		super(ob);
		cost = ob.cost;
	}
	
	public BoxShipment(double len, double weight, double cost) {
		super(len, weight);
		this.cost = cost;
	}
	
	public BoxShipment(double width, double height, double depth, double weight, double cost) {
		super(width, height, depth, weight);
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
