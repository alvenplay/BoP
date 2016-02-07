package Release_VIII.B_Chapter_13.P5_PrintWriter;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("To jest lancuch.");
		int i=-7;
		pw.println(i);
		double d = 4.5E-7;
		pw.println(d);
	}

}
