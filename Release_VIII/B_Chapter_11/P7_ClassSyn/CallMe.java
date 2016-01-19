package Release_VIII.B_Chapter_11.P7_ClassSyn;

public class CallMe {
	void call(String msg) throws InterruptedException {
		System.out.print("[" +msg);
		Thread.sleep(1000);
		System.out.println("]");
	}
}
