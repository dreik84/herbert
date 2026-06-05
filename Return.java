// Демонстрация работы return
class Return {
	public static void main(String[] args) {
		
		boolean t = true;

		System.out.println("Перед оператором return");
		
		if (t) return; // возвратить управление вызывающей стороне

		System.out.println("Не выполниться");
	}
}
