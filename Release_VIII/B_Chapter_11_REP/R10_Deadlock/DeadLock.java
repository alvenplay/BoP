package Release_VIII.B_Chapter_11_REP.R10_Deadlock;

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();
	
	DeadLock() {
		Thread.currentThread().setName("Watek glowny");
		Thread t = new Thread(this, "Watek wyscigu");
		t.start();
		
		a.foo(b);
		System.out.println("Powrot do watku glownego");
	}

	@Override
	public void run() {
		b.bar(a);
		System.out.println("Powrot do watku glownego");
		
	}
	
	public static void main(String[] args) {
		new DeadLock();
	}

}
