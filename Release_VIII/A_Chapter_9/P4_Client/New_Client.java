package Release_VIII.A_Chapter_9.P4_Client;

public class New_Client implements Call{

	@Override
	public void callback(int p) {
		System.out.println("Inna wersja interfejsu.");
		System.out.println("p^2 == " +Math.pow(p, 2));
		
	}
	
}
