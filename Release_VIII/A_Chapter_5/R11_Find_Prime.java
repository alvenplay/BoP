package Release_VIII.A_Chapter_5;

public class R11_Find_Prime {

	public static void main(String[] args) {
		int num = 17;
		boolean isPrime = true;
		
		for(int i=2; i<num; i++) {
			if((num%i)==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("To jest liczba pierwsza.");
		} else {
			System.out.println("To nie jest liczba pierwsza.");
		}

	}

}
