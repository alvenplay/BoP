package Release_VIII.A_Chapter_8.P7_Shipment;

public class Demo {

	public static void main(String[] args) {
		BoxShipment s1 = new BoxShipment(10, 20, 15, 10, 3.41);
		BoxShipment s2 = new BoxShipment(2, 3, 4, 0.76, 1.28);
		
		System.out.println("Objetosc s1 = " +s1.vol());
		System.out.println("    Waga s1 = " +s1.getWeight());
		System.out.println("   Koszt s1 = " +s1.getCost());
		
		System.out.println("Objetosc s2 = " +s2.vol());
		System.out.println("    Waga s2 = " +s2.getWeight());
		System.out.println("   Koszt s2 = " +s2.getCost());

	}

}
