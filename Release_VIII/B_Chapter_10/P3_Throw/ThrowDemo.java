package Release_VIII.B_Chapter_10.P3_Throw;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
		demoproc();
		} catch(NullPointerException e) {
			System.out.println("Ponowne zlapanie: " +e);
		}

	}
	
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch(NullPointerException e) {
			System.out.println("Zlapanie wewnatrz metody.");
			throw e;
		}
	}

}
