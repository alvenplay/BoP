package Release_VIII.A_Chapter_9.P2_Protection.p1;

public class Derived extends Protection {
	Derived() {
		System.out.println("Konstruktor podklasy: ");
		System.out.println("n_clr = " +n_clr);
		System.out.println("n_pri = " /*+n_pri*/ +"Brak dostepu.");
		System.out.println("n_pro = " +n_pro);
		System.out.println("n_pub = " +n_pub);
	}
}
