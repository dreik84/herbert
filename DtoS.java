// Простая утилита, которая читает содержимое текстового файла
import java.io.*;

class DtoS {
	public static void main(String[] args) {
		String s;

		// Создать и использовать объект FileReader
		try (BufferedReader br = new 
				BufferedReader(new FileReader("text.txt"))) 
		{
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}
