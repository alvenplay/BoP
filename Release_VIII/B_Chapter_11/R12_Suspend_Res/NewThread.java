package Release_VIII.B_Chapter_11.R12_Suspend_Res;

public class NewThread implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;
	
	public NewThread(String name) {
		this.name = name;
		suspendFlag = false;
		t = new Thread(this, name);
		t.start();
		System.out.println("Nowy watek: " +t);
	}
	
	@Override
	public void run() {
		try {
			for(int i=15; i>0; i--) {
				System.out.println(name +": " +i);
				Thread.sleep(200);
				synchronized (this) {
					while(suspendFlag){
						wait();
					}
				}
			}
		} catch(InterruptedException e) {}
		
		System.out.println("Wyjscie z watka");
	}
	
	synchronized void setSusTrue() {
		suspendFlag = true;
	}
	
	synchronized void setSusFalse() {
		suspendFlag = false;
		notify();
	}

}
