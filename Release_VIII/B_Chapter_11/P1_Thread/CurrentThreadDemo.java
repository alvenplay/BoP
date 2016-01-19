package Release_VIII.B_Chapter_11.P1_Thread;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Aktualny watek: " +t);
		
		t.setName("Moj watek");
		System.out.println("Po zmianie nazwy: " +t);
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Przerwanie watku glownego.");
		}
		
	}
	
}
