// Класс очереди для символов
class Stack {
	// эти члены теперь закрытые
	private char[] q;           // массив, хранящий данные стэка
	private int putloc, getloc; // индексы для позиций помещиния и извлечения
	
	// Конструирует пустой объект Stack заданного размера
	Stack(int size) {
		q = new char[size];  // выделение памяти под очередь
		putloc = 0; getloc = size - 1;
	}

	// Конструирует объект Stack на основе другого объекта
        Stack(Stack ob) {
                putloc = ob.getloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		// Копировать элементы
		for (int i = getloc; i < putloc; i++) q[i] = ob.q[i];
        }

	// Конструирует объект Stack с начальными значениями
        Stack(char[] a) {
                putloc = 0;
                getloc = 0;
                q = new char[a.length];

                // Копировать элементы
                for (int i = 0; i < a.length; i++) push(a[i]);
        }

	// Поместить символ в стэк
	void push(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Стэк переполнен");
			return;
		}

		q[putloc++] = ch;
	}

	// Извлечь символ из стэка
	char pop() {
		if (getloc == putloc) {			
			System.out.println(" - Стэк пуст");
			return (char) 0;
		}

		return q[getloc--];
	}
}
