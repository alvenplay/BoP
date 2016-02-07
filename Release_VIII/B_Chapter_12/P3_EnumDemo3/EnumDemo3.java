package Release_VIII.B_Chapter_12.P3_EnumDemo3;

public class EnumDemo3 {

	public static void main(String[] args) {
		System.out.println("Winesap kosztuje " +Apple.Winesap.getPrice() +" zlotych.\n");
		
		System.out.println("Ceny wszystkich jablek");
		for(Apple a : Apple.values()) {
			System.out.println(a + " kosztuje " +a.getPrice() +" zlotych.");
		}

	}

}
