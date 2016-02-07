package Release_VIII.A_Chapter_9.P2_Protection.p2;

public class OtherPackage {
	OtherPackage() {
		Release_VIII.A_Chapter_9.P2_Protection.p1.Protection p = new Release_VIII.A_Chapter_9.P2_Protection.p1.Protection();
		
		System.out.println("Konstruktor z innego pakietu: ");
		System.out.println("n_clr = " /*+p.n_clr*/ +"Brak dostepu.");
		System.out.println("n_pri = " /*+p.n_pri*/ +"Brak dostepu.");
		System.out.println("n_pro = " /*+p.n_pro*/ +"Brak dostepu.");
		System.out.println("n_pub = " +p.n_pub);
	}
}
