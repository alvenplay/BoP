package Release_VIII.B_Chapter_11.R11_Suspend_Res;

public class NewThread implements Runnable {
	String name;
	Thread t;
	
	public NewThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("Nowy watek " +t);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i=15; i>0; i--) {
				System.out.println(name +": " +i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {}
		System.out.println("Wyjsie z " +name);
		
	}
	
}
