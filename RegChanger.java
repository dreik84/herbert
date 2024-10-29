// Программа переводит символы в другой регистр
class RegChanger {
	public static void main(String[] args) throws java.io.IOException {
		var res = "";
		char ch;

		do {
			ch = (char) System.in.read();

			if (ch <= 90 && ch >= 65) {
				res += (char) (ch + 32);
			} else if (ch <= 122 && ch >= 97) {
                                res += (char) (ch - 32);
                        } else {
				res += ch;
			}

		} while ( ch != '.');

		System.out.println("Преобразованная строка: " + res);
	}
}
