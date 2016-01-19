package Additional_Projects_Pack.D11_P1_REP_Stack;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		for(int i=0; i<10; i++) {
			stack.push(i);
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(stack.pull());;
		}
	}

}
