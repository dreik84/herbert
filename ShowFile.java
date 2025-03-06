// Отображение содержимого текстового файла
import java.io.*;

class ShowFile {
	public static void main(String[] args) {
		int i;

		// Первым делом надо удостовериться, что имя файла было указано
		if (args.length != 1) {
			System.out.println("Использование: ShowFile имя-файла");
			return;
		}
		
		// Оператор try с ресурсами
		try (FileInputStream fin = new FileInputStream(args[0])) {

			// Читать байты, пока не встретится конец файла
                        do {
                                i = fin.read();
                                if (i != -1) System.out.print((char) i);
                        } while (i != -1);

		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);

		}	
	}
}
