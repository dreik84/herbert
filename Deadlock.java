// Пример возникновения взаимоблокировки


class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " вошел в A.foo");

		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("A прерван");
		}

		System.out.println(name + " пытается вызвать B.last");
		b.last();
	}
}

class B {
        synchronized void bar(A a) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " вошел в B.bar");

                try {
                        Thread.sleep(1000);
                } catch(InterruptedException e) {
                        System.out.println("B прерван");
                }

                System.out.println(name + " пытается вызвать A.last");
                a.last();
        }
}
