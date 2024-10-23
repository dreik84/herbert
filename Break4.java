// Использование оператора break с меткой
class Break4 {
	public static void main(String[] args) {
		int i;

		for (i = 1; i < 4; i++) {
	one: {
	two:    {
	three:     {
			System.out.println("\n i равно " + i);
			
			if (i == 1) break one; // перейти по метке
			if (i == 2) break two; // перейти по метке
			if (i == 3) break three; // перейти по метке

			// Эта строка никогда не выводится
			System.out.println("не выводится");
	     	   }
		   System.out.println("После блока three");
	        }
		System.out.println("После блока two");
	     }
	     System.out.println("После блока one");
		}
		System.out.println("После цикла for");
	}
}
