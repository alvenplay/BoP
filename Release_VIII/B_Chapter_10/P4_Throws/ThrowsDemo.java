package Release_VIII.B_Chapter_10.P4_Throws;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			demo();
		} catch(IllegalAccessException e) {
			System.out.println("Zlapano: " +e);
		}

	}
	
	static void demo() throws IllegalAccessException {
		System.out.println("Wewnatrz demo.");
		throw new IllegalAccessException("demo");
	}

}
