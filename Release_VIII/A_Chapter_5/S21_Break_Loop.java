package Release_VIII.A_Chapter_5;

public class S21_Break_Loop {

	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(i==10) break;
			System.out.println("i = " +i);
		}
		System.out.println("Koniec petli");

	}

}
