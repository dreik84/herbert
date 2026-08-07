
class IFTest {
	public static void main(String[] args) {
		
		IntStack stack = new FixedStack(10);
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
}
