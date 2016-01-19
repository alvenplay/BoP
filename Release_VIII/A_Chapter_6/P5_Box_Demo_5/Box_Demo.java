package Release_VIII.A_Chapter_6.P5_Box_Demo_5;

public class Box_Demo {

	public static void main(String[] args) {
		Box mb1 = new Box();
		Box mb2 = new Box();
		
		mb1.setDim(10, 20, 15);
		mb2.setDim(3, 6, 9);
		
		System.out.println("Objetosc: " +mb1.volume());
		System.out.println("Objetosc: " +mb2.volume());

	}

}
