package Release_VIII.B_Chapter_11_REP.P3_Thread;

public class NewThread extends Thread {
	
	NewThread() {
		super("Przykladowy watek");
		System.out.println("Watek potomny: " +this);
		start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Watek potomny " +i);
				Thread.sleep(500);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Wyjscie z watka potomnego.");
	}
}
