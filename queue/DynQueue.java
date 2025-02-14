// Динамическая очередь
class DynQueue implements ICharQ {
	private char[] q;           // массив, в котором хранится очередь
	private int putloc, getloc; // индексы для помещения и извлечения
	
	// Конструктор пустой очереди заданного размера
	public DynQueue(int size) {
		q = new char[size];  // выделение памяти под очередь
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	public void put(char ch) {
		if (putloc == q.length) {
			// Увеличить размер очереди
			char[] t = new char[q.length * 2];

			// Скопировать элементы в новую очередь
			for (int i = 0; i < q.length; i++) t[i] = q[i];

			q = t;
		}
		q[putloc++] = ch;
	}

	// Извлечь символ из очереди
	public char get() {
		if (getloc == putloc) {
			System.out.println("Очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}	

}
