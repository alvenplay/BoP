package Release_VIII.A_Chapter_8.P2_Access;

public class Access {

	public static void main(String[] args) {
		B ob2 = new B();
		
		ob2.setij(10, 12);
		
		ob2.sum();
		
		System.out.println("j=private Access_Error // Suma: " +ob2.total);

	}

}
