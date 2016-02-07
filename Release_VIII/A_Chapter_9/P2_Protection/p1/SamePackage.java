package Release_VIII.A_Chapter_9.P2_Protection.p1;

public class SamePackage extends Protection {
	public SamePackage() {
		Protection p = new Protection();

		System.out.println("Konstruktor z tego samego pakietu: ");
		System.out.println("n_clr = " +p.n_clr);
		System.out.println("n_pri = " /*+p.n_pri*/ +"Brak dostepu.");
		System.out.println("n_pro = " +p.n_pro);
		System.out.println("n_pub = " +p.n_pub);
	}
}
