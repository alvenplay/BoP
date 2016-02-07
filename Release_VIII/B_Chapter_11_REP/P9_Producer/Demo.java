package Release_VIII.B_Chapter_11_REP.P9_Producer;

public class Demo {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
	}
	
}
