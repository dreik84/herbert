// Программа ведёт подсчёт пробелов в введённом тексте
class WSCounter {
	public static void main(String[] args) throws java.io.IOException {
		int count = 0;
		char ch;

		do {
			ch = (char) System.in.read();
			if (ch == ' ') count++;
		} while ( ch != '.');

		System.out.println("Количество пробелов: " + count);
	}
}
