package Release_VIII.B_Chapter_11.P8_PC;

public class Producer implements Runnable {
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		new Thread(this, "Producent").start();
	}

	@Override
	public void run() {
		int n =0;
		
		while(true) {
			q.put(n++);
		}
		
	}
}
