// Сдвиг влево как быстрый способ умножеиния на 2
class MultByTwo {
	public static void main(String[] args) {
		
		int num = 0xFFFFFFE; // 0000 1111 1111 1111 1111 1111 1111 1110
		
		for (int i = 0; i < 4; i++) {
			num = num << 1;
			System.out.println(num);
		}	
	}
}
