package Release_VIII.B_Chapter_11_REP.P9_Producer;

public class Q {
	int n;
	boolean value = false;
	synchronized int get() {
		if(!value) {
			try {
				wait();
			} catch(Exception e) {}
		}
		System.out.println("Pobrano: " +n);
		value = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		if(value) {
			try {
				wait();
			} catch(Exception e) {}
		}
		System.out.println("Wlozono: " +n);
		value = true;
		this.n = n;
		notify();
	}
}
