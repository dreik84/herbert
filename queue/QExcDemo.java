// Демонстрация исключений, связанных с очередью
class QExcDemo {
	public static void main(String[] args) {
	FixedQueue q = new FixedQueue(10);
	char ch;
	int i;

	try {
		// Переполнение очереди
		for (i = 0; i < 11; i++)
			System.out.print("Попытка сохранения: " + (char) ('A' + i));

		q.put((char) ('A' + i));
		System.out.println(" - успешно");
	} catch (QueueFullException exc) {
		System.out.println(exc);
	}
	System.out.println();

	try {
		// Опустошение очереди
		for (i = 0; i < 11; i++)                                                                       System.out.print("Получение следующего символа: ");

		ch = q.get();
		System.out.println(ch);
	} catch (QueueEmptyException exc) {
                System.out.println(exc);
        }
	}
}
