package Release_VIII.B_Chapter_13.P7_Copy_Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		if(args.length != 2) return;
		
		try {
			fin = new FileInputStream("src/Release_VIII/B_Chapter_13/P7_Copy_Files/" +args[0]);
			fout = new FileOutputStream("src/Release_VIII/B_Chapter_13/P7_Copy_Files/" +args[1]);
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("Blad wejscia-wyjscia");
		} finally {
			try {
				if(fin != null) fin.close();
			} catch(Exception e) {}
			try {
				if(fout != null) fout.close();
			} catch(Exception e) {}
			System.out.println("Skopiowano");
		}
	}

}
