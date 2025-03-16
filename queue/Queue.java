// Класс очереди для символов
class Queue {
	// эти члены теперь закрытые
	private char[] q;           // массив, хранящий данные очереди
	private int putloc, getloc; // индексы для позиций помещиния и извлечения
  
	// Конструирует пустой объект Queue заданного размера
	Queue(int size) {
		q = new char[size];  // выделение памяти под очередь
		putloc = getloc = 0;
	}

	// Конструирует объект Queue на основе другого объекта
        Queue(Queue ob) {
                putloc = ob.getloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		// Копировать элементы
		for (int i = getloc; i < putloc; i++) q[i] = ob.q[i];
        }

	// Конструирует объект Queue с начальными значениями
        Queue(char[] a) {
                putloc = 0;
                getloc = 0;
                q = new char[a.length];

                // Копировать элементы
                for (int i = 0; i < a.length; i++) put(a[i]);
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
