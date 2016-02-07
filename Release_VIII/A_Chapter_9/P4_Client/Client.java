package Release_VIII.A_Chapter_9.P4_Client;


public class Client implements Call {
	
	public void callback(int p) {
		System.out.println("Wywolanie metody callback() z wartoscia " +p);
	}
	
	void nonIfaceMeth() {
		System.out.println("Klasa implementujaca interfejs moze zawierac wlasne metody.");
	}
	
}