package Release_VIII.B_Chapter_11_REP.P6_NoSync;

public class CallMe {
	void call(String msg) {
		System.out.print("[" +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("]");
	}
}
