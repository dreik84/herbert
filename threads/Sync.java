// Использование синхронизации для управления доступом
class Sync {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};

		MyThread mt1 = MyThread.createAndStart("Child #1", a);
		MyThread mt2 = MyThread.createAndStart("Child #2", a);

		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch (InterruptedException exc) {
			System.out.println("Главные поток прерван");
		}
	}
}

class SumArray {
	private int sum;
	
	int sumArrray(int[] nums) {  // Метод синхронизирован
		sum = 0; // сбросить sum
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Промежуточная сумма в потоке " +
					Thread.currentThread().getName() + 
					" равна " + sum);
			try {
				Thread.sleep(10); // разрешить переключение задач
			}
			catch (InterruptedException exc) {
				System.out.println("Поток прерван");
			}
		}
		return sum;
	}
}

class MyThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int[] a;
	int answer;

	// Конструктор нового потока
	MyThread(String name, int[] nums) {
		thrd = new Thread(this, name);
		a = nums;
	}

	// Фабричный метод, который создает и запускает поток
	public static MyThread createAndStart(String name, int[] nums) {
		MyThread myThrd = new MyThread(name, nums);

		myThrd.thrd.start(); // запустить поток
		return myThrd;
	}

	// Точка входа в поток
	public void run() {
		int sum;

		System.out.println("Поток " + thrd.getName() + " запущен");
		
		synchronized(sa) {
			answer = sa.sumArray(a);
		}
		
		System.out.println("Сумма в потоке " + thrd.getName() + 
				" равна " + answer);

		System.out.println("Поток " + thrd.getName() + " завершен");
	}
}
