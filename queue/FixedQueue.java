// Очередь символов фиксированного размера
class FixedQueue implements ICharQ {
	private char[] q;            // массив в котором хранится очередь
	private int putloc, getloc;  // индексы для помещения и извлечения
	
	// Контсруктор пустой очереди заданного размера
	FixedQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	public void put(char ch) {
		if (putloc == q.length) {
			System.out.println("- Очередь переполнена");
			return;
		}
		q[putloc++] = ch;
	}

	// Извлечение символа из очереди
	public char get() {
		if (getloc == putloc) {
			System.out.println("- Очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}
}
