// Демонтрация использования интерфейса ICharQ
class IQDemo {
	public static void main(String[] args) {
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);

		ICharQ iQ;
		char ch;
		int i;

		iQ = q1;
		// Поместить ряд символов в очередь фиксированного размера
		for (i = 0; i < 10; i++) iQ.put((char) ('A' + i));

		// Отобразить содержимое очереди
		System.out.print("Содержимое очереди фиксированного размера: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();

		iQ = q2;
		// Поместить ряд символов в динамическую очередь
                for (i = 0; i < 10; i++) iQ.put((char) ('Z' - i));

                // Отобразить содержимое очереди
                System.out.print("Содержимое динамической очереди: ");
                for (i = 0; i < 10; i++) {
                        ch = iQ.get();
                        System.out.print(ch);                                                          }
                System.out.println();

		iQ = q3;
		// Поместить ряд символов в кольцевую очередь
                for (i = 0; i < 10; i++) iQ.put((char) ('A' + i));

                // Отобразить содержимое очереди
                System.out.print("Содержимое кольцевой очереди: ");
                for (i = 0; i < 10; i++) {
                        ch = iQ.get();
                        System.out.print(ch);                                                          }
                System.out.println();

	        // Поместить дополнительные символы в кольцевую очередь
                for (i = 10; i < 20; i++) iQ.put((char) ('A' + i));

                // Отобразить содержимое очереди
		System.out.print("Содержимое кольцевой очереди: ");                                    for (i = 0; i < 10; i++) {                                                                     ch = iQ.get();                                                                         System.out.print(ch);                                                          }
		
		System.out.println("\nСохранение и использование элементов в кольцевой очереди");
		// Сохранение и использование элементов в кольцевой очереди
		for (i = 0; i < 20; i++) {
			iQ.put((char) ('A' + i));
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();		
	}
}
