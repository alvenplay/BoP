package Release_VIII.B_Chapter_11_REP.P2_Runnable;

public class Demo {
	
	public static void main(String[] args) {
		new NewThread();
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Watek glowny: " +i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Koniec watku glownego");
		}
		System.out.println("Wyjscie z watku glownego.");
	}

}
