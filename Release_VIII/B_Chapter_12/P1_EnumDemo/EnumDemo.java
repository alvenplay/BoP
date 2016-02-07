package Release_VIII.B_Chapter_12.P1_EnumDemo;

public class EnumDemo {

	public static void main(String[] args) {
		Apple ap = Apple.RedDel;
		
		System.out.println("Wartość ap = " +ap +"\n");
		
		ap = Apple.GoldenDel;
		
		if(ap == Apple.GoldenDel) {
			System.out.println("ap zawiera GoldenDel. \n");
		}
		
		switch(ap) {
		case Jonathan:
			System.out.println("Jonathan jest czerwone.");
			break;
		case GoldenDel:
			System.out.println("Golden Delicious jest zlote");
			break;
		case RedDel:
			System.out.println("Red Delicious jest czerwone.");
			break;
		case Winesap:
			System.out.println("Winesap jest czerwone.");
			break;
		case Cortland:
			System.out.println("Cortland jest czerwone.");
			break;
		}
		
	}

}
