package Release_VIII.A_Chapter_6.P2_Box_Demo_2;

public class Box_Demo {

	public static void main(String[] args) {
		Box mb1 = new Box();
		Box mb2 = new Box();
		
		mb1.width = 10;
		mb1.height = 20;
		mb1.depth = 15;
		
		mb2.width = 3;
		mb2.height = 6;
		mb2.depth = 9;
		
		System.out.println("Rozmiar Box1 == " +(mb1.width * mb1.depth * mb1.height));
		System.out.println("Rozmiar Box2 == " +(mb2.width * mb2.depth * mb2.height));

	}

}
