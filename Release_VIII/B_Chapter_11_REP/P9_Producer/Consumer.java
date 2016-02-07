package Release_VIII.B_Chapter_11_REP.P9_Producer;

public class Consumer implements Runnable {
	Q q;
	
	Consumer(Q q) {
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
