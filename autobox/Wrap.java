// Ручная упаковка и распаковка
class Wrap {
	public static void main(String[] args) {
		Integer iOb = Integer.valueOf(100); // ручная упаковка в объект
		int i = iOb.intValue(); // ручная распаковка

		System.out.println(i + " " + iOb); // выводит 100 100
	}
}
