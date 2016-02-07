package Release_VIII.B_Chapter_11.P6_Synch;

public class Caller implements Runnable {
	Thread t;
	CallMe target;
	String msg;
	
	public Caller(CallMe target, String msg) {
		this.target = target; this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			target.call(msg);
		} catch (InterruptedException e) {}
		
	}
}
