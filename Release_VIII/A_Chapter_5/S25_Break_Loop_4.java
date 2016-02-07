package Release_VIII.A_Chapter_5;

public class S25_Break_Loop_4 {

	public static void main(String[] args) {
		outer : {
			for(int i=0; i<3; i++) {
				System.out.print("Przebieg " +i + ": ");
				for(int j=0; j<100; j++) {
					if(j==10) break outer;
					System.out.print(j + " ");
				}
			}
			System.out.println("To sie nie wyswietli.");
		}
		System.out.println("Koniec obu petli.");

	}

}
