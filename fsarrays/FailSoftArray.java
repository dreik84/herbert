// Этот класс реализует "отказоустойчивый" массив
class FailSoftArray {
	private int[] a;     // ссылка на массив 
	private int errval;  // значение, возвращаемое в случае отказа get()
	public int length;   // открытый член length
	
	// Конструируем массив с заданым размером и значением
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	// Возвращает значение по заданному индексу
	public int get(int index) {
		if (indexOK(index)) return a[index];
		return errval;
	}

	// Помещает значение по заданному индексу
	public boolean put(int index, int val) {
		if (indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	// Возвращает true, если индекс находится внутри границ массива
	private boolean indexOK(int index) {
		if (index >= 0 & index < length) return true;
		return false;
	}
}
