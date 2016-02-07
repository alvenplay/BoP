package Release_VIII.B_Chapter_11_REP.P3_Thread;

public class Demo {

	public static void main(String[] args) {
		new NewThread();
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Watek glowny " +i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Wyjscie z watka glownego.");

	}

}
