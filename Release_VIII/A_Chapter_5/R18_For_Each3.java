package Release_VIII.A_Chapter_5;

public class R18_For_Each3 {

	public static void main(String[] args) {
		int nums[][] = new int[3][5];
		int sum = 0;
		
		for(int i=0; i<3; i++)
			for(int j=0; j<5; j++)
				nums[i][j] = (i+1)*(j+1);
		
		for(int i[] : nums)
			for(int j : i) {
				System.out.println("Value = " +j);
				sum+=j;
			}
		
		System.out.println("Sum == " +sum);

	}

}
