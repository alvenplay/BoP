package Release_VIII.A_Chapter_4;

public class R12_Ternary {

	public static void main(String[] args) {
		int i=10;
		int k = i<0 ? -i: i;
		System.out.println("Wartosc bezwzgledna z " +i +" wynosi " +k);
		
		i = -10;
		k = i<0 ? -i: i;
		System.out.println("Wartosc bezwzgledna z " +i +" wynosi " +k);

	}

}
