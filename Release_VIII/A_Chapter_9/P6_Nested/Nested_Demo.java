package Release_VIII.A_Chapter_9.P6_Nested;

public class Nested_Demo {

	public static void main(String[] args) {
		A.NestedIF nif = new B();
		
		if(nif.isNotNegative(10)) System.out.println("Liczba 10 nie jest ujemna");
		if(nif.isNotNegative(-10)) System.out.println("Liczba jest ujemna, nie zostanie wyswietlone.");

	}

}
