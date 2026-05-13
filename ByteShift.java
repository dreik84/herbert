// Сдвиг влево значения byte
class ByteShift {
	public static void main(String[] args) {
		
		byte a = 64, b;
		int i;

		i = a << 2;          // 0100 0000 << 0000 0001 0000 0000
		b = (byte) (a << 2); // 0
		
		System.out.println("Первоначальное значение a: " + a);
		System.out.println("Значеиние int i: " + i);
		System.out.println("Значеиние byte b: " + b);
	}
}
