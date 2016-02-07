package Release_VIII.A_Chapter_5;

public class S23_Break_Loop_3 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println("Przebieg " +i +": ");
			for(int j=0; j<100; j++) {
				if(j==10) break;
				System.out.println(j +" ");
			}
			System.out.println();
		}
		System.out.println("Koniec petli.");

	}

}
