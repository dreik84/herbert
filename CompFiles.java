// Сравнение двух фойлов
import java.io.*;

class CompFiles {
	public static void main(String[] args) {
		int i = 0, j = 0;
		
		// Удостоверимся, что имена файлов указаны
		if (args.length != 2) {
			System.out.println("Использование: CompFiles файл1 файл2");
			return;
		}

		// Сравнить файлы
		try (FileInputStream f1 = new FileInputStream(args[0]);
			FileInputStream f2 = new FileInputStream(args[1]))
		{
			// Проверить содержимое каждого файла
			do {
				i = f1.read();
				j = f2.read();

				if (i != j) break;
			} while (i != -1 && j != -1);

			if (i != j)
				System.out.println("Содержимое файлов отличается");
			else
				System.out.println("Содержимое файлов совпадает");
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}
