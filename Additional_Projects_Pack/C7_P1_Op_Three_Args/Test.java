package Additional_Projects_Pack.C7_P1_Op_Three_Args;

public class Test {
	int a, b;
	
	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	boolean equals(Test obj) {
		return this.a == obj.a && this.b == obj.b ? true : false;
	}
}
