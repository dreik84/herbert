class TestStack {
	public static void main(String[] args) {
		
		Stack mystack1 = new Stack(5);
		Stack mystack2 = new Stack(8);

		for (int i = 0; i < 10; i++) mystack1.push(i);
		for (int i = 10; i < 20; i++) mystack2.push(i);

		System.out.println("Стек mystack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(mystack1.pop());

		System.out.println("Стек mystack2:");
                for (int i = 0; i < 10; i++)
                        System.out.println(mystack2.pop());

		// mystack1.tos = -3;       // ошибка
		// mystack2.stck[3] = 100;  // ошибка
	}
}
