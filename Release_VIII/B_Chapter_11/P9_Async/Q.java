package Release_VIII.B_Chapter_11.P9_Async;

public class Q {
	int n;
	boolean valSet = false;
	
	synchronized int get() {
		if(!valSet)
			try {
				wait();
			} catch(InterruptedException e) {}
		
		System.out.println("Pobrano: " +n);
		valSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		if(valSet)
			try {
				wait();
			} catch(InterruptedException e) {}
		
		this.n = n;
		valSet = true;
		System.out.println("Wlozono: " +n);
		notify();
	}
}
