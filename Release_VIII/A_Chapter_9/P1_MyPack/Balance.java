package Release_VIII.A_Chapter_9.P1_MyPack;

public class Balance {
	String name;
	double bal;
	
	public Balance(String name, double bal) {
		this.name = name;
		this.bal = bal;
	}
	
	public void show() {
		if(bal<0) {
			System.out.print("-->> ");
		}
		System.out.println(name +": " +bal +" zl.");
	}
}