// Копирование текстового файла
import java.io.*;

class CopyFile {
	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		// Удостовериться, что оба имени файла были указаны
		if (args.length != 2) {
			System.out.println("Использование: CopyFile исходный-файл целевой-файл");
			return;
		}

		// Копировать файл
		try {
			// Попытка открытия файла
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException exc) {
				System.out.println("Ошибка закрытия исходного файла");
			}
			try {
                                if (fout != null) fout.close();                                                } catch (IOException exc) {
                                System.out.println("Ошибка закрытия целевого файла");                          }
		}
	}
}
