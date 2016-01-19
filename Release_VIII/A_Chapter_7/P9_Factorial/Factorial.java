package Release_VIII.A_Chapter_7.P9_Factorial;

public class Factorial {
	
	int Fact(int n) {
		int result;
		
		if(n == 1) {
			return 1;
		} else {
			result = Fact(n-1)*n;
			return result;
		}
	}
}
