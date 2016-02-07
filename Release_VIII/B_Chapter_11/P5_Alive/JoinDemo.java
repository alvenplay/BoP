package Release_VIII.B_Chapter_11.P5_Alive;

public class JoinDemo {

	public static void main(String[] args) {
		NewThread t[] = new NewThread[3];
		t[0] = new NewThread("Jeden");
		t[1] = new NewThread("Dwa");
		t[2] = new NewThread("Trzy");
		
		System.out.println("Watek Jeden isAlive: " +t[0].t.isAlive());
		System.out.println("Watek Dwa isAlive: " +t[1].t.isAlive());
		System.out.println("Watek Trzy isAlive: " +t[2].t.isAlive());
		
		try {
			System.out.println("Oczekiwanie na zakonczenie watkow.");
			t[0].t.join();
			t[1].t.join();
			t[2].t.join();
		} catch(InterruptedException e) {
			System.out.println("Przerwano watek glowny.");
		}
		
		System.out.println("Watek Jeden isAlive: " +t[0].t.isAlive());
		System.out.println("Watek Dwa isAlive: " +t[1].t.isAlive());
		System.out.println("Watek Trzy isAlive: " +t[2].t.isAlive());
		
		System.out.println("Koniec watku glownego.");
	}
	
}
