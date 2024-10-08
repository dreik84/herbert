// Игра в угадывание буквы
class Guess {
	public static void main(String[] args) throws java.io.IOException {
		char ch, answer = 'K';

		System.out.println("Задумана буква между A и Z.");
		System.out.print("Попробуйте её угадать: ");

		ch = (char) System.in.read(); // чтение символа с клавиатуры
		if (ch == answer) System.out.println(" ** Правильно ** ");
		else System.out.println("...Увы, не угадали.");
	}
}
