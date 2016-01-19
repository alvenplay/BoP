package Release_VIII.A_Chapter_9.P2_Protection.p1;

public class Protection {
	int n_clr = 1;
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;
	
	public Protection() {
		System.out.println("Konstruktor klasy bazowej: ");
		System.out.println("n_clr = " +n_clr);
		System.out.println("n_pri = " +n_pri);
		System.out.println("n_pro = " +n_pro);
		System.out.println("n_pub = " +n_pub);
	}
}
