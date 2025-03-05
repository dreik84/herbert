// Отображение содержимого текстового файла
import java.io.*;

class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;

		// Первым делом надо удостовериться, что имя файла было указано
		if (args.length != 1) {
			System.out.println("Использование: ShowFile имя-файла");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);

			// Читать байты, пока не встретится конец файла
                        do {
                                i = fin.read();
                                if (i != -1) System.out.print((char) i);
                        } while (i != -1);

		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);

		} finally {
			// Закрытие файла при выходе из блока try
			try {
                                if (fin != null) fin.close();
                        } catch (IOException exc) {
                                System.out.println("Ошибка при закрытии файла");
                        }
		}	
	}
}
