package Release_VIII.B_Chapter_11_REP.P7_Sync;

public class Caller implements Runnable {
	String msg;
	CallMe target;
	Thread t;
	
	public Caller(CallMe target, String message) {
		this.target = target;
		this.msg = message;
		this.t= new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		target.call(msg);
	}
	
}
