package Release_VIII.A_Chapter_5;

public class S26_Break_Errno {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		one: {
			for(int i=0; i<3; i++) {
				System.out.print("Przebieg " +i +": ");
			}
		}
		
		for(int i=0; i<100; i++) {
			if(i==10) break /*one*/;     // BREAK ONE;
			System.out.print(i +" ");
		}

	}

}
