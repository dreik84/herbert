// Использование блоков кода в операторах switch со стрелкой
class BlockArrowCaseDemo {
	
	enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT }

	public static void main(String[] args) {
		
		int productID = 5099;
		boolean extraCharge;

		ShipMethod shipBy =  switch (productID) {
			case 1774, 8708, 6709 -> {
				extraCharge = true;
				yield ShipMethod.TRUCK;
			}
			case 4657, 2195, 3621, 1887 -> {
				extraCharge = false;
				yield ShipMethod.AIR;
			}
			case 2907, 5099 -> {
				extraCharge = true;
				yield ShipMethod.OVERNIGHT;
			}
			default -> {
				extraCharge = false;
				yield ShipMethod.STANDARD;
			}
		}; // точка с запятой здесь обязательна

		System.out.println("Способ доставки товара с идентификатором " + 
				productID + ": " + shipBy);

		if (extraCharge) System.out.println("Требуется доплата");
	}
}
