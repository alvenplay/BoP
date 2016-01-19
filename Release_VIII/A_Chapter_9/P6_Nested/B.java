package Release_VIII.A_Chapter_9.P6_Nested;

public class B implements A.NestedIF {
	
	public boolean isNotNegative(int x) {
		return x < 0 ? false:true;
	}
}
