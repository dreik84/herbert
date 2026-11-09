// Автоупаковка/автораспаковка объектов Boolean и Character

class AutoBox4 {
	public static void main(String[] args) {
		
		Boolean b = true;

		if (b) System.out.println("b is true");

		Character ch = 'x';

		char ch2 = ch;

		System.out.println("ch2 equals " + ch2);

	}
}
