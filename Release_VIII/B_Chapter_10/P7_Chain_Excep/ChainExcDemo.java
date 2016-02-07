package Release_VIII.B_Chapter_10.P7_Chain_Excep;

public class ChainExcDemo {

	public static void main(String[] args) {
		try {
			demoproc();
		} catch(NullPointerException e) {
			System.out.println("Zlapano: " +e +"\n\n");
			
			System.out.println("Oryginalny powod: " +e.getCause());
		}
		
	}
	
	static void demoproc() {
		NullPointerException e = new NullPointerException("Najwyzszy poziom");
		e.initCause(new ArithmeticException("Powod"));
		throw e;
	}

}
