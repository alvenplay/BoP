package Release_VIII.B_Chapter_11_REP.P2_Runnable;

public class NewThread implements Runnable {
	Thread t;
	
	NewThread() {
		t = new Thread(this, "Przykladowy watek");
		System.out.println("Watek potomny: " +t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Watek potomny: " +i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Przerwano dzialanie potomka.");
		}
		System.out.println("Wyjscie z watku potomka");
	}
}
