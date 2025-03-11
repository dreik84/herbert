// Чтение с клавиатуры и запись в файл
import java.io.*;

class KtoD {
	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in, System.console().charset()));

		System.out.println("Вводите текст (stop для завершения)");
		
		try (FileWriter fw = new FileWriter("text.txt"))	
		{
			do {
				System.out.print(": ");
				str = br.readLine();

				if (str.compareTo("stop") == 0) break;

				str = str + "\r\n"; // символ новой строки
				fw.write(str);

			} while (str.compareTo("stop") != 0);
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}
