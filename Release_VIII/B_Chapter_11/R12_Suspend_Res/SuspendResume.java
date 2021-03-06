package Release_VIII.B_Chapter_11.R12_Suspend_Res;

public class SuspendResume {

	public static void main(String[] args) {
		NewThread t1 = new NewThread("Jeden");
		NewThread t2 = new NewThread("Dwa");
		
		try {
			Thread.sleep(1000);
			t1.setSusTrue();
			System.out.println("Zawieszenie watku Jeden");
			Thread.sleep(1000);
			t1.setSusFalse();
			System.out.println("Wznowienie watku Jeden");
			t2.setSusTrue();
			System.out.println("Zawieszenie watku Dwa");
			Thread.sleep(1000);
			t2.setSusFalse();
			System.out.println("Wznowienie watku Dwa");
		} catch(InterruptedException e) {}
		
		try {
			t1.t.join();
			t2.t.join();
		} catch(InterruptedException e) {}
		
		System.out.println("Koniec watku glownego");

	}

}
