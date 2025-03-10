// Чтение строки с применением BufferedReader
import java.io.*;

class ReadLines {
	public static void main(String[] args) throws IOException {
		
		String str;

		BufferedReader br = new BufferedReader(new 
			InputStreamReader(System.in, System.console().charset()));

		System.out.println("Вводите строки текта");
		System.out.println("Для завершения введите stop");
		
		do {
			str = br.readLine();
			System.out.println(str);

		} while (!str.equals("stop"));
	}
}
