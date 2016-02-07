package Release_VIII.B_Chapter_11_REP.P5_Alive;

public class Demo {

	public static void main(String[] args) {
		NewThread ob1 = new NewThread("Jeden");
		NewThread ob2 = new NewThread("Dwa");
		NewThread ob3 = new NewThread("Trzy");
		
		System.out.println("Watek Jeden zyje: " +ob1.t.isAlive());
		System.out.println("Watek Dwa zyje: " +ob2.t.isAlive());
		System.out.println("Watek Trzy zyje: " +ob3.t.isAlive());
		
		try{
			System.out.println("Oczekiwanie");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Przerwano watek glowny");
		}
		
		System.out.println("Watek Jeden zyje: " +ob1.t.isAlive());
		System.out.println("Watek Dwa zyje: " +ob2.t.isAlive());
		System.out.println("Watek Trzy zyje: " +ob3.t.isAlive());
		
		System.out.println("Koniec watku glownego");
	}

}
