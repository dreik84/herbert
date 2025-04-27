// Использование case со стрелками в операторе switch
class StatementSwitchWithArrow {
	public static void main(String[] args) {
		
		// Счетчики для произвоственных линий
		int line1count = 0;
		int line2count = 0;
		int line3count = 0;

		// Номер производственной линии
		int productionLine;

		for (int i = 1; i < 10; i++) {
			
			// Эмулировать выпуск продукции
			productionLine = (i % 3) + 1;

			switch (productionLine) {
				case 1 -> {
					line1count++;
					System.out.println("Линия 1 выпустила");
				}
				case 2 -> {                                                                                    line2count++;                                                                          System.out.println("Линия 2 выпустила");                                       }
				case 3 -> {                                                                                    line3count++;                                                                          System.out.println("Линия 3 выпустила");                                       }
			}
		}
		System.out.println("Общее количество продукции " +
				(line1count + line2count + line3count));
	}
}
