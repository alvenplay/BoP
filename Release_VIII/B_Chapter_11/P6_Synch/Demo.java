package Release_VIII.B_Chapter_11.P6_Synch;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		CallMe target = new CallMe();
		Caller o1 = new Caller(target, "Witaj");
		Caller o2 = new Caller(target, "Zsynchronizowany");
		Caller o3 = new Caller(target, "Swiecie");
		
		o1.t.join();
		o2.t.join();
		o3.t.join();
	}

}
