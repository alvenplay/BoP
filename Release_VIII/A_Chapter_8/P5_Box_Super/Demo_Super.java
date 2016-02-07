package Release_VIII.A_Chapter_8.P5_Box_Super;

public class Demo_Super {

	public static void main(String[] args) {
		Box_Weight mb1 = new Box_Weight(10, 20, 15, 34.3);
		Box_Weight mb2 = new Box_Weight(2, 3, 4, 0.076);
		Box_Weight mb3 = new Box_Weight();
		Box_Weight mc = new Box_Weight(3, 2);
		Box_Weight mclone = new Box_Weight(mb1);
		
		System.out.println("Objetosc mb1 = " +mb1.vol());
		System.out.println("Ciezar mb1 = " +mb1.weight);
		System.out.println();
		
		System.out.println("Objetosc mb2 = " +mb2.vol());
		System.out.println("Ciezar mb2 = " +mb2.weight);
		System.out.println();
		
		System.out.println("Objetosc mb3 = " +mb3.vol());
		System.out.println("Ciezar mb3 = " +mb3.weight);
		System.out.println();
		
		System.out.println("Objetosc mc = " +mc.vol());
		System.out.println("Ciezar mc = " +mc.weight);
		System.out.println();
		
		System.out.println("Objetosc mcl = " +mclone.vol());
		System.out.println("Ciezar mcl = " +mclone.weight);
		System.out.println();
	}

}
