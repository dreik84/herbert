// Кольцевая очередь
class CircularQueue implements ICharQ {
	private char[] q;           // массив, в котором хранится очередь
	private int putloc, getloc; // индексы для помещения и извлечения
	
	// Конструктор пустой очереди заданного размера
	public CircularQueue(int size) {
		q = new char[size + 1];  // выделение памяти под очередь
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	public void put(char ch) {
		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("Очередь переполнена");
			return;
		}
		q[putloc++] = ch;
		if (putloc == q.length) putloc = 0; // закольцевать	
	}

	// Извлечь символ из очереди
	public char get() {
		if (getloc == putloc) {
			System.out.println("Очередь пуста");
			return (char) 0;
		}
		char ch = q[getloc++];
		if (getloc == q.length) getloc = 0; // закольцевать
		return ch;
	}
}
