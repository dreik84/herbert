// Класс очереди для символов
class Queue {
	// эти члены теперь закрытые
	private char[] q;           // массив, хранящий данные очереди
	private int putloc, getloc; // индексы для позиций помещиния и извлечения

	Queue(int size) {
		q = new char[size];  // выделение памяти под очередь
		putloc = getloc = 0;
	}

	// Поместить символ в очередь
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Очередь переполнена");
			return;
		}

		q[putloc++] = ch;
	}

	// Извлечь символ из очереди
	char get() {
		if (getloc == putloc) {			
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}

		return q[getloc++];
	}
}
