// Копирование текстового файла
import java.io.*;

class CopyFile {
	public static void main(String[] args) throws IOException {
		int i;

		// Удостовериться, что оба имени файла были указаны
		if (args.length != 2) {
			System.out.println("Использование: CopyFile исходный-файл целевой-файл");
			return;
		}

		// Копировать файл
		try (FileInputStream fin = new FileInputStream(args[0]);
		     FileOutputStream fout = new FileOutputStream(args[1])) {

			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}
