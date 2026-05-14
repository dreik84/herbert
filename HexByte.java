// Маскирование расширения знака
class HexByte {
	public static void main(String[] args) {
		
		char[] hex = {
			'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
		};

		byte b = (byte) 0xf1; // 1111 0001
				      // 1111 1111 >> 4
				      // 0000 1111 0x0f
				      // 0000 1111 & = f
				      // 0000 0001 b & 0x0f = 1

		System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
	}
}
