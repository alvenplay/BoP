package Release_VIII.A_Chapter_5;

public class R19_Search {

	public static void main(String[] args) {
		int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4};
		int val = 5;
		boolean found=false;
		
		for(int i : nums)
			if(i == val) {
				found=true;
				break;
			}
		if(found) {
			System.out.println("Warotosc zostala znaleziona.");
		} else {
			System.out.println("Brak takiej wartosci.");
		}

	}

}
