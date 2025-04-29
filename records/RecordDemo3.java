// Использование неканонического конструктора
record Item(String name, int itemNum, double price) {
	
	static double pricePending = -1;

	public Item(String name, int itemNum, String price) {
		this(name, itemNum, Double.parseDouble(price));
	}
}

class RecordDemo3 {
	public static void main(String[] args) {
		
		// Создать массив записей
		Item[] items = new Item[4];

		// Заполнить массив элеметами
		items[0] = new Item("Hammer", 257, 10.99);
		items[1] = new Item("Wrench", 18, 19.29);
		items[2] = new Item("Drill", 903, "22.25");
		items[3] = new Item("Saw", 27, "34.59");

		// Использовать методы доступа
		for (Item myItem : items) {
			System.out.println(myItem.name() + "; Идентификационный номер "
				+ myItem.itemNum() + "; Цена " + myItem.price());
		}
	}
}
