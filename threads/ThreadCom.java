// Использование wait() и notify() для имитации работы часов

class ThreadCom {
public static void main(String[] args) {
TickTock tt = new TickTock();
MyThread mtl = MyThread.createAndStart("Tick", tt);
MyThread mt2 = MyThread.createAndStart("Tock", tt);
try {
mtl.thrd.join();
mt2.thrd.join();
}
catch(InterruptedException exc) {
System.out.println("Главный поток прерван.");
}
}
}

class TickTock {
	String state; // хранит состояни часов
	
	synchronized void tick(boolean running) {
		if (!running) {
			state = "ticked";
			notify(); // уведомить ожидающие потоки
			return;
		}
		System.out.print("Tick ");

		state = "ticked";  // установить текущее состояние в "тик"

		notify(); // позволить tock() выполняться

		try {
			while(!state.equals("tocked"))
			wait(); //ожидать завершения работы метода tock()
		}
		catch(InterruptedException exc) {
			System.out.println("Поток прерван.");
		}
	}

	synchronized void tock(boolean running) {
		if(!running) {             // остановить часы
			state = "tocked";  
			notify();	   // уведомить ожидающие потоки
			return;
			}
		System.out.println("Tock");
		state = "tocked"; // установить текущее состяние
		notify(); // позволить методу tick() выполняться
		
		try {
                        while(!state.equals("ticked"))
                        wait(); //ожидать завершения работы метода tick()                              }
                catch(InterruptedException exc) {
                        System.out.println("Поток прерван.");
                }
	}
}

class MyThread implements Runnable {
Thread thrd;
TickTock ttOb;
// Конструктор нового потока.
MyThread(String name, TickTock tt) {
thrd = new Thread(this, name);
ttOb = tt;
} // Фабричный метод, который создает и
запускает поток,
public static MyThread createAndStart(String name, TickTock tt) {
MyThread myThrd = new MyThread(name, tt);
myThrd.thrd.start(); // запустить поток
return myThrd;
}
// Точка входа в поток,
public void run() {
if(thrd.getName().compareTo("Tick") == 0) {
for(int i=0; i<5; i++) ttOb.tick(true);
ttOb.tick(false);
}
else {
for(int i=0; i<5; i++) ttOb.tock(true);
ttOb.tock(false);
}
}
}
