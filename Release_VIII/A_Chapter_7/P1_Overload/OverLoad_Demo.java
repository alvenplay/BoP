package Release_VIII.A_Chapter_7.P1_Overload;

public class OverLoad_Demo {

	public static void main(String[] args) {
		OverLoad ol = new OverLoad();
		
		ol.test();
		ol.test(10);
		ol.test(10,20);
		
		System.out.println("Wynik ol.test(123.25): " +ol.test(123.25));

	}

}
