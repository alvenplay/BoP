package Release_VIII.B_Chapter_11.P4_Multi_TH;

public class MultiThreaded implements Runnable {
	String name;
	Thread t;
	
	public MultiThreaded(String name) {
		this.name = name;
		t = new Thread(this, this.name);
		System.out.println("Nowy watek: " +t);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println(name + ": " +i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Przerwano: " +name);
		}
		System.out.println("Wyjscie z: " +name);
	}

}
