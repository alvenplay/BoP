package Release_VIII.A_Chapter_6.P1_Box_Demo;

public class Box_Demo {

	public static void main(String[] args) {
		Box mybox = new Box();
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		

		double vol = mybox.depth * mybox.height * mybox.width;
		
		System.out.println("Obj == " +vol);

	}
}



