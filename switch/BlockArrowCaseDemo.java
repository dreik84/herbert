// Использование блоков кода в операторах switch со стрелкой
class BlockArrowCaseDemo {
	
	enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT }
	record MyRec(boolean extraCharge, ShipMethod method){}

	public static void main(String[] args) {
		
		int productID = 5099;

		MyRec shipBy =  switch (productID) {
			case 1774, 8708, 6709 -> new MyRec(true, ShipMethod.TRUCK);
			case 4657, 2195, 3621, 1887 -> new MyRec(true, ShipMethod.AIR);
			case 2907, 5099 -> new MyRec(true, ShipMethod.OVERNIGHT);
			default -> new MyRec(true, ShipMethod.STANDARD);
		}; // точка с запятой здесь обязательна

		System.out.println("Способ доставки товара с идентификатором " + 
				productID + ": " + shipBy);

		if (shipBy.extraCharge()) System.out.println("Требуется доплата");
	}
}
