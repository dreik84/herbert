// Использование break в качестве "цивилизованной" формы перехода с стиле "goto"
class Break {
	public static void main(String[] args) {
		
		boolean t = true;

		first: {
			second: {
				third: {
					System.out.println("До оператора break");
					
					if (t) break second;

					System.out.println("Не выполнится");
				}

				System.out.println("Не выполнится");
			}
			System.out.println("После блока second");
		}
	}
}
