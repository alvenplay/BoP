package Release_VIII.A_Chapter_3;

public class P9_Scope_Err {

	public static void main(String[] args) {
		int bar = 1;
		{
			//int bar = 2;
		}
		System.out.println(bar);
	}

}
