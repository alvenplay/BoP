package Release_VIII.B_Chapter_11_REP.P7_Sync;

public class CallMe {
	synchronized void call(String msg) {
		System.out.print("[" +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("]");
	}
}
