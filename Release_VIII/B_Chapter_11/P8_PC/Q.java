package Release_VIII.B_Chapter_11.P8_PC;

public class Q {
	int n;
	
	synchronized int get() {
		System.out.println("Pobrano: " +n);
		return n;
	}
	
	synchronized void put(int n) {
		this.n = n;
		System.out.println("Wlozono: " +n);
	}
}
