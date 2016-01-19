package Release_VIII.A_Chapter_9.P2_Protection.p2;

import Release_VIII.A_Chapter_9.P2_Protection.p1.Protection;

public class Protection2 extends Protection {
	Protection2() {
		System.out.println("Konstruktor podklasy z innego pakietu: ");
		System.out.println("n_clr = " /*+n_clr*/ +"Brak dostepu.");
		System.out.println("n_pri = " /*+n_pri*/ +"Brak dostepu.");
		System.out.println("n_pro = " +n_pro);
		System.out.println("n_pub = " +n_pub);
	}
}
