// Использование throws
class ThrowsDemo {
	
	public static void main(String[] args) {
                char ch;

                try {
                        ch = prompt("Введите букву");
                } catch (java.io.IOException exc) {
                        System.out.println("Возникло исключение ввода-вывода");
                        ch = 'X';
                }
                System.out.println("Вы нажали клавишу " + ch);
        }

	public static char prompt(String str) throws java.io.IOException {
		
		System.out.print(str + ": ");
		return (char) System.in.read();
	}
}
