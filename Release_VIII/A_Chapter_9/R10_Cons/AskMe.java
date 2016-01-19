package Release_VIII.A_Chapter_9.R10_Cons;

public class AskMe implements SharedCons {

	public static void main(String[] args) {
		Questions q = new Questions();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());

	}

	static void answer(int result) {
		switch(result) {
			case NO:
				System.out.println("NIE");
				break;
			case YES:
				System.out.println("TAK");
				break;
			case MAYBE:
				System.out.println("MOZE");
				break;
			case LATER:
				System.out.println("POZNIEJ");
				break;
			case SOON:
				System.out.println("WKROTCE");
				break;
			case NEVER:
				System.out.println("Nigdy");
				break;
		}
	}
	
}
