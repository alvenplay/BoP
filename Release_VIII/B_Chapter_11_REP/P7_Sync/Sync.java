package Release_VIII.B_Chapter_11_REP.P7_Sync;

public class Sync {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		Caller ob1 = new Caller(target, "Witaj");
		Caller ob2 = new Caller(target, "Zsynchronizowany");
		Caller ob3 = new Caller(target, "Swiecie");
		
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {}
	}
	
}
