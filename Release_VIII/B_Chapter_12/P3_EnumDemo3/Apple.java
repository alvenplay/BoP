package Release_VIII.B_Chapter_12.P3_EnumDemo3;

public enum Apple {
	Jonathan(10),
	GoldenDel(9),
	RedDel,
	Winesap(15),
	Cortland(8);
	
	private int price;
	
	Apple(int p) {price = p;}
	Apple() {price = -1;}
	
	int getPrice() {return price;}
}
