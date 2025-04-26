// Использование оператора switch со стрелкой
class SwitchExprDemo2 {
	
	enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT }

	public static void main(String[] args) {
		
		int productID = 5099;

		ShipMethod shipBy =  switch (productID) {
			case 1774, 8708, 6709 -> ShipMethod.TRUCK;
			case 4657, 2195, 3621, 1887 -> ShipMethod.AIR;
			case 2907, 5099 -> ShipMethod.OVERNIGHT;
			default -> ShipMethod.STANDARD;
		}; // точка с запятой здесь обязательна

		System.out.println("Способ доставки товара с идентификатором " + 
				productID + ": " + shipBy);
	}
}
