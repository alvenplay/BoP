package Release_VIII.A_Chapter_5;

public class S24_Break_as_GoTo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean t=true;
		
		first: {
			second: {
				third: {
					System.out.println("Przed break.");
					if(t) break second;
					System.out.println("To sie nie wykona.");
				}
			System.out.println("To sie nie wykona.");
			}
		System.out.println("Po drugim bloku");
		}

	}

}
