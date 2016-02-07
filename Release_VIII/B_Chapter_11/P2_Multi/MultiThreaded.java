package Release_VIII.B_Chapter_11.P2_Multi;

public class MultiThreaded implements Runnable {
	Thread t;
	
	public MultiThreaded() {
		t = new Thread(this, "Przykladowy watek");
		System.out.println("Watek potomny: " +t);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Watek potomny: " +i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Przerwano dzialanie potomka.");
		}
		System.out.println("Wyjscie z watku potomka.");
	}

}
