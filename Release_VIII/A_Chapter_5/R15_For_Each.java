package Release_VIII.A_Chapter_5;

public class R15_For_Each {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		
		for(int x : nums) {
			System.out.println("Wartosc x = " +x);
			sum += x;
		}
		
		System.out.println("Suma wartosci = " +sum);

	}

}
