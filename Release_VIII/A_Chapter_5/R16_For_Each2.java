package Release_VIII.A_Chapter_5;

public class R16_For_Each2 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		
		for(int i : nums) {
			sum+=i;
			if(i == 5) break;
		}
		System.out.println("Wartosc to " +sum);

	}

}
