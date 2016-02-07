package Release_VIII.B_Chapter_12.P4_EnumDemo4;

public class EnumDemo4 {

	public static void main(String[] args) {
		Apple ap = Apple.RedDel, ap2 = Apple.GoldenDel, ap3 = Apple.RedDel;
		System.out.println("Wszystkie stale wyliczeniowa oraz ich wartosci liczbowe: ");
		for(Apple a : Apple.values()) {
			System.out.println(a +" " +a.ordinal());
		}
		
		System.out.println();
		
		if(ap.compareTo(ap2) < 0) {
			System.out.println(ap + " znajduje sie przed " +ap2);
		}

		if(ap.compareTo(ap2) > 0) {
			System.out.println(ap2 + " znajduje sie przed " +ap);
		}

		if(ap.compareTo(ap3) == 0) {
			System.out.println(ap + " jest rowne " +ap3);
		}
		
		System.out.println();
		
		if(ap.equals(ap2)) {
			System.out.println("Blad!");
		}

		if(ap.equals(ap3)) {
			System.out.println(ap +" jest rowne " +ap3);
		}

		if(ap == ap3) {
			System.out.println(ap +" == " +ap3);
		}
	}

}
