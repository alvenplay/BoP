package Release_VIII.B_Chapter_10.P5_Finally;

public class Finally {

	public static void main(String[] args) {
		try {
			procA();
		} catch(Exception e) {
			System.out.println("Zlapanie wyjatku.");
		}
		procB();
		procC();

	}
	
	static void procA() {
		try {
			System.out.println("Wewnatrz A");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("Finally z procA");
		}
	}
	
	static void procB() {
		try {
			System.out.println("Wewnatrz B");
			return;
		} finally {
			System.out.println("Finally z procB");
		}
	}
	
	static void procC() {
		try {
			System.out.println("Wewnatrz C");
		} finally {
			System.out.println("Finally z procC");
		}
	}

}
