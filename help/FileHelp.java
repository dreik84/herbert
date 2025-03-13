// Справочная система, которая использует диск для хранения
import java.io.*;

class FileHelp {
	public static void main(String[] args) {
		Help hlpobj = new Help("helpfile.txt");
		String topic;

		System.out.println("Демонтсрация работы справочной системы. " + 
				"Для завершения введите stop.");

		do {
			topic = hlpobj.getSelection();

			if (!hlpobj.helpOn(topic))
				System.out.println("Тема не найдена\n");
		} while (topic.compareTo("stop") != 0);
	}
}

class Help {
	String helpfile; // имя справочного файла
	
	Help(String fname) {
		helpfile = fname;
	}

	// Отображение справочной информации по заданной теме
	boolean helpOn(String what) {
		int ch;
		String topic, info;

		// Открыть справочный файл
		try (BufferedReader helpRdr = new BufferedReader(new 
					FileReader (helpfile)))
		{
			do {
				// Читать символы пока не встретиться #
				ch = helpRdr.read();

				// Проверить, соответствует ли тема
				if (ch == '#') {
					topic = helpRdr.readLine();
					if (what.compareTo(topic) == 0) {
						// Тема найдена
						do {
							info = helpRdr.readLine();
							if (info != null) 
							  System.out.println(info);
						} while ((info != null) &&
							(info.compareTo("") != 0));
						return true;
					}					
				}
			} while (ch != -1);
		}
		catch (IOException exc) {
			System.out.println("Ошибка доступа к файлу");
			return false;
		}
		return false; // тема не найдена
	}
	
	// Получение справочной темы
	String getSelection() {
		String topic = "";
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in, System.console().charset()));
		System.out.print("Введите название темы: ");
		try {
			topic = br.readLine();
		} catch (IOException exc) {
			System.out.println("Ошибка при чтении с консоли");
		}
		return topic;
	}
}
