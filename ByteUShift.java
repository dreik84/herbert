// Беззнаковый сдвиг вправо значения типа byte
class ByteUShirt {
	static public void main(String[] args) {
		
		char[] hex = {
			'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
		};

		byte b = (byte) 0xf1;      // 1111 0001
		byte c = (byte) (b >> 4);  // 1111 1111 = 0xff
		byte d = (byte) (b >>> 4); // 0000 1111 = 0x0f (0xff)
		byte e = (byte) ((b & 0xff) >> 4); // 1111 0001 b
						   // 1111 1111 ff
						   // 1111 0001 &
						   // 1111 1111 >> 4
	}
}
