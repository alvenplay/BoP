package Release_VIII.B_Chapter_13.P8_ShowFileAC;

import java.io.FileInputStream;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		
		if(args.length != 1) return;
		
		try(FileInputStream fin = new FileInputStream("src/Release_VIII/B_Chapter_13/P6_ShowFile/" +args[0])) {
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		} catch(Exception e) {
			
		}
	}

}
