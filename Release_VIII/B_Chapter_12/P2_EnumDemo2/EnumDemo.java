package Release_VIII.B_Chapter_12.P2_EnumDemo2;

public class EnumDemo {

	public static void main(String[] args) {
		Apple ap;
		
		System.out.println("Wszystkie stale wyliczenia Apple:");
		
		for(Apple a : Apple.values()) {
			System.out.println(a);
		}
		
		System.out.println();
		
		ap = Apple.valueOf("Winesap");
		System.out.println("ap zawiera " +ap);
	}

}
