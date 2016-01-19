package Release_VIII.A_Chapter_8.P3_Box;

public class Box_Demo {

	public static void main(String[] args) {
		Ext_Box b1 = new Ext_Box(10, 20, 15, 3);
		Ext_Box b2 = new Ext_Box(3, 4, 2, 0.076);
		
		System.out.println("Objetosc b1: " +b1.vol());
		System.out.println("Ciezar b1: " +b1.weight);
		System.out.println();
		
		System.out.println("Objetosc b2: " +b2.vol());
		System.out.println("Ciezar b2: " +b2.weight);
		System.out.println();

	}

}
