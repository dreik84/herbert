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
	public void put(char ch) throws QueueFullException {
		if (putloc == q.length) throw new QueueFullException(q.length);

		q[putloc++] = ch;
	}

	// Извлечение символа из очереди
	public char get() throws QueueEmptyException {
		if (getloc == putloc) throw new QueueEmptyException();

		return q[getloc++];
	}
}
