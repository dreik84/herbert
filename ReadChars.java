// Использование BufferedReader для чтения символов с консоли
import java.io.*;

class ReadChars {
	public static void main(String[] args) throws IOException {
		
		char c;

		BufferedReader br = new BufferedReader(new 
			InputStreamReader(System.in, System.console().charset()));

		System.out.println("Вводите символы; для выхода введите точку.");
		// Читать символы
		do {
			c = (char) br.read();
			System.out.println(c);

		} while(c != '.');
	}
}
