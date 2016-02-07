package Release_VIII.A_Chapter_7.P3_Overload_Box;

public class Box_Overload {

	public static void main(String[] args) {
		Box mb1 = new Box();
		Box mb2 = new Box(7);
		Box mb3 = new Box(10, 20, 15);
		
		System.out.println("Obj mb1 = " +mb1.volume());
		System.out.println("Obj mb2 = " +mb2.volume());
		System.out.println("Obj mb3 = " +mb3.volume());

	}

}
