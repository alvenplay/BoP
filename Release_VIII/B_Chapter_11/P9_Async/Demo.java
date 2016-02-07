package Release_VIII.B_Chapter_11.P9_Async;

public class Demo {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("CTRL + C to cancell");
	}

}
