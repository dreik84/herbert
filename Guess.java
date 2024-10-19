// Игра в угадывание буквы
class Guess {
	public static void main(String[] args) throws java.io.IOException {
		char ch, ignore, answer = 'K';

		do {

		System.out.println("Задумана буква между A и Z.");
		System.out.print("Попробуйте её угадать: ");

		ch = (char) System.in.read(); // чтение символа с клавиатуры
		
		// Отбросить все остальные символы из буфера ввода
		do {
			ignore = (char) System.in.read();
		} while (ignore != '\n');

		if (ch == answer) System.out.println(" ** Правильно ** ");
		else {
			System.out.print("...Увы, не угадали. Задуманная буква находится ");

			// Вложенный оператор if
			if (ch < answer) System.out.println("дальше по алфавиту.");
			else System.out.println("ближе по алфавиту.");
			System.out.println("Повторите попытку!\n");
		}
		} while (answer != ch);
	}
}
