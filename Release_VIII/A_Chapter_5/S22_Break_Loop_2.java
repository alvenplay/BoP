package Release_VIII.A_Chapter_5;

public class S22_Break_Loop_2 {

	public static void main(String[] args) {
		int i=0;
		
		while(i<100) {
			if(i==10) break;
			System.out.println("i = " +i++);
		}
		
		System.out.println("Koniec petli");

	}

}
