package Release_VIII.A_Chapter_9.P4_Client;

public class Demo {

	public static void main(String[] args) {
		Call c = new Client();
		New_Client nc = new New_Client();
		
		c.callback(42);
		
		c = nc;
		c.callback(42);
		
	}

}
