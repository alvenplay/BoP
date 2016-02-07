package Release_VIII.A_Chapter_5;

public class S28_Continue_Label {

	public static void main(String[] args) {
		outer: 	for(int i=0; i<10; i++) {
					for(int j=1; j<10; j++) {
						if(j>i) {
							System.out.println();
							continue outer;
						}
						System.out.print(" " +(i*j));
					}
				}
		System.out.println();

	}

}
