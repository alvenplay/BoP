package Release_VIII.B_Chapter_11_REP.P9_Producer;

public class Producer implements Runnable {
	Q q;

	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producent").start();
	}
	
	@Override
	public void run() {
		int i = 0;
		
		while(true) {
			q.put(i++);
		}
	}
	
	
}
