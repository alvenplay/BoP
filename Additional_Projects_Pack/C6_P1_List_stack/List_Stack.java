package Additional_Projects_Pack.C6_P1_List_stack;

public class List_Stack {

	public static void main(String[] args) {
		Stack mb1 = new Stack();
		
		for(int i=0; i<=20; i++) mb1.push(i);
		
		for(int i=0; i<10; i++) {
			System.out.println(mb1.pop());
		}

	}

}
