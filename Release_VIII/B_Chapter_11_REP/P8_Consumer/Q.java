package Release_VIII.B_Chapter_11_REP.P8_Consumer;

public class Q {
	int n;
	
	synchronized int get() {
		System.out.println("Pobrano: " +n);
		return n;
	}
	
	synchronized void put(int n) {
		System.out.println("Wlozono: " +n);
		this.n = n;
	}
}
