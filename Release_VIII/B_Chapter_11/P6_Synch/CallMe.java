package Release_VIII.B_Chapter_11.P6_Synch;

public class CallMe {
	synchronized void call(String msg) throws InterruptedException {
		System.out.print("[" +msg);
		Thread.sleep(1000);
		System.out.println("]");
	}
}
