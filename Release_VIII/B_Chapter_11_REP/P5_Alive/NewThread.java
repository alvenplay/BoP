package Release_VIII.B_Chapter_11_REP.P5_Alive;

public class NewThread implements Runnable {
	String name;
	Thread t;
	
	NewThread(String threadname) {
		name=threadname;
		t = new Thread(this, name);
		System.out.println("Nowy watek: " +t);
		t.start();
	}
	@Override
	public void run() {
		try {
			for(int i =5; i>0; i--) {
				System.out.println(name +": " +i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Przerwano " +name);
		}
		System.out.println("Zakonczono " +name);
	}

}
