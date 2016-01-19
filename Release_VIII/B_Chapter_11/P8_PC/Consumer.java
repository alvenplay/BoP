package Release_VIII.B_Chapter_11.P8_PC;

public class Consumer implements Runnable {
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		new Thread(this, "Konsument").start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
		}
		
	}
}
