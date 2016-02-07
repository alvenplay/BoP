package Release_VIII.B_Chapter_11_REP.P4_MultiRunnable;

public class Demo {

	public static void main(String[] args) {
		new NewThread("Jeden");
		new NewThread("Dwa");
		new NewThread("Trzy");
		
		try {
			Thread.sleep(10000);
			
		} catch(InterruptedException e) {
			System.out.println("Przerwano watek glowny");
		}
		System.out.println("Koniec watku glownego.");
	}

}
