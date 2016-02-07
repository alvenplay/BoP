package Release_VIII.B_Chapter_11.P3_Multi_TH;

public class Demo {

	public static void main(String[] args) {
		new MultiThreaded();
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Watek glowny: " +i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Przerwano watek glowny.");
		}
		System.out.print("Wyjscie z watku glownego");

	}

}
