package Release_VIII.A_Chapter_7.P5_Overload_Box_2;

public class Overload_Box {

	public static void main(String[] args) {
		Box mb1 = new Box();
		Box mb2 = new Box(10, 20 ,15);
		Box mc = new Box(7);
		
		Box myclone = new Box(mb2);
		
		System.out.println("Objetosc mb2 = " +mb2.volume());
		System.out.println("Objetosc mb1 = " +mb1.volume());
		System.out.println("Objetosc mc  = " +mc.volume());
		System.out.println("Objetosc mcl = " +myclone.volume());

	}

}
