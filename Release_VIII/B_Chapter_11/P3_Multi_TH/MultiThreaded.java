package Release_VIII.B_Chapter_11.P3_Multi_TH;

public class MultiThreaded extends Thread {
	
	public MultiThreaded() {
		super("Przykladowy watek");
		System.out.println("Watek potomny: " +this);
		start();
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
