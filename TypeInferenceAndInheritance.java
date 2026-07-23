// Выведение типов при работе с наследованием

class TypeInferenceAndInheritance {
	
	static MyClass getObj(int which) {
		switch(which) {
			case 0: return new MyClass();
			case 1: return new FirstDerivedClass();
			default: return new SecondDerivedClass();	
		}
	}

	public static void main(String[] args) {
		
		var mc = getObj(0);  // MyClass
		var mc2 = getObj(1); // FirstDerivedClass
		var mc3 = getObj(2); // SecondDerivedClass


		// mc2.x = 10; // ошибка
		// mc3.y = 20; // ошибка
	}
}

class MyClass {
}

class FirstDerivedClass extends MyClass {
	int x;
}

class SecondDerivedClass extends FirstDerivedClass {
	int y;
}
