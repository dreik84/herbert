// Демонстрация динамической диспетчеризации методов
class DynDisDemo {
	public static void main(String[] args) {
		Sup superOb = new Sup();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();

		Sup supRef;

		supRef = superOb;
		supRef.who();

		supRef = subOb1;
                supRef.who();

		supRef = subOb2;
                supRef.who();
	}
}

class Sup {
	void who() {
		System.out.println("who() in Sup");
	}
}

class Sub1 extends Sup {
        void who() {
                System.out.println("who() in Sub1");
        }                                                                              }

class Sub2 extends Sup {
        void who() {
                System.out.println("who() in Sub2");
        }                                                                              }
