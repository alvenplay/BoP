package Release_VIII.B_Chapter_11_REP.P1_Example;

public class CurrentThread {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();

		System.out.println("Aktualny watek to: " +t);
		
		t.setName("GlownyWatek");
		
		System.out.println("Po zmianie nazwy: " +t);
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			System.out.println("Przerwanie watku glownego");
		}
	}

}
