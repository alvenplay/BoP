package Release_VIII.B_Chapter_11.P7_ClassSyn;

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
			synchronized (target) {
				target.call(msg);
			}
		} catch (InterruptedException e) {}
		
	}
}
