// Использование операции исключающего ИЛИ для кодирования и декодирования сообщения
class EncodeString {
	public static void main(String[] args) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "password";

		System.out.print("Исходное сообщение: ");
		System.out.println(msg);

		// Закодировать сообщение

		for (int i = 0, j = 0; i < msg.length(); i++) {

			encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
			j++;
			if (j == key.length()) j = 0;

		}

		System.out.print("Закодированное сообщение: ");
		System.out.println(encmsg);

		// Декодировать сообщение

		for (int i = 0, j = 0; i < msg.length(); i++) {

                        decmsg = decmsg + (char) (msg.charAt(i) ^ key.charAt(j));
                        j++;
                        if (j == key.length()) j = 0;

                }

                System.out.print("Декодированное сообщение: ");
		System.out.println(decmsg);
	}
}
