// Демонстрация использования PrintWriter
import java.io.*;

public class PrintWriterDemo {
	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		double d = 123.65;

		pw.println("Использование PrintWriter");
		pw.println(i);
		pw.println(d);

		pw.println(i + " + " + d + " равно " + (i + d));
	}
}
