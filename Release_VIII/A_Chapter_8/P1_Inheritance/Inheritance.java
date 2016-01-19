package Release_VIII.A_Chapter_8.P1_Inheritance;

public class Inheritance {

	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = new B();
		
		ob1.i = 7;
		ob1.j = 10;
		
		System.out.println("Zawartosc ob1: ");
		ob1.showij();
		System.out.println();
		
		ob2.i = 7;
		ob2.j = 9;
		ob2.k = 8;
		System.out.println("Zawartosc ob2: ");
		ob2.showij();
		ob2.showk();
		System.out.println();
		
		System.out.println("Suma: ");
		ob2.sum();

	}

}
