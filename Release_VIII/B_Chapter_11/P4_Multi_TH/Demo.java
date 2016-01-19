package Release_VIII.B_Chapter_11.P4_Multi_TH;

public class Demo {

	public static void main(String[] args) {
		new MultiThreaded("Jeden");
		new MultiThreaded("Dwa");
		new MultiThreaded("Trzy");
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			System.out.println("Przerwano watek glowny.");
		}
		
		System.out.print("Wyjscie z watku glownego");
		
	}

}
