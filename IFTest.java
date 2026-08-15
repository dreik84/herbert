
class IFTest {
	public static void main(String[] args) {
		
		IntStack fixedStack = new FixedStack(10);
		IntStack dynStack = new DynStack(10);

		for (int i = 0; i < 12; i++) fixedStack.push(i);
		for (int i = 0; i < 12; i++) dynStack.push(i);

		for (int i = 0; i < 12; i++)
			System.out.print(fixedStack.pop() + " ");

		System.out.println();

		for (int i = 0; i < 12; i++)
                        System.out.print(dynStack.pop() + " ");

		System.out.println();

		fixedStack.clear();
		dynStack.clear();
	}
}

// Реализация расширяемого стека
class DynStack implements IntStack {
	private int[] stck;
	private int tos; // top of stack
	
	DynStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	public void push(int item) {
		if (tos == stck.length - 1) {
			int[] temp = new int[stck.length * 2];

			for (int i = 0; i < stck.length; i++)
				temp[i] = stck[i];

			stck = temp;
		}

		stck[++tos] = item;
	}

	public int pop() {
		if (tos < 0) {
			System.out.println("Стек пуст");
			return 0;
		}

		return stck[tos--];
	}
}

// Реализация IntStack фиксированной длины
class FixedStack implements IntStack {
	private int[] stck;
	private int tos; // top of stack
	
	FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	public void push(int item) {
		if (tos == stck.length - 1)
			System.out.println("Стек полон");
		else
			stck[++tos] = item;
	}

	public int pop() {
		if (tos == -1) {
			System.out.println("Стек пуст");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}

// Интерфейс целочисленного стека
interface IntStack {
	void push(int value);
	int pop();

	default void clear() {
		System.out.println("Метод clear не реализован");
	}

	default int[] popNElements(int n) {
		return getElements();
	}

	default int[] skipAndPopNElements(int skip, int n) {
		getElements(skip);

		return getElements(n);
	}

	private int[] getElements(int n) {
		int[] elements = new int[n];

		for (int i = 0; i < n; i++) elements[i] = pop();

		return elements();
	}
}
