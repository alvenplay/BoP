package Release_VIII.A_Chapter_6.P3_Box_Demo_3;

public class Box_Demo {

	public static void main(String[] args) {
		Box mb1 = new Box();
		Box mb2 = new Box();
		
		mb1.depth = 10;
		mb1.width = 20;
		mb1.height = 15;
		
		mb2.depth = 3;
		mb2.width = 6;
		mb2.height = 9;
		
		mb1.volume();
		mb2.volume();

	}

}
