// Использование традиционного оператора switch
class TraditionalSwitch {
	
	enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT }

	public static void main(String[] args) {
		ShipMethod shipBy;
		int productID = 5099;

		switch (productID) {
			case 1774:
			case 8708:
			case 6709:
				shipBy = ShipMethod.TRUCK;
				break;
			case 4657:
			case 2195:
			case 3621:
			case 1887:
				shipBy = ShipMethod.AIR;
				break;
			case 2907:
			case 5099:
				shipBy = ShipMethod.OVERNIGHT;
				break;
			default:
				shipBy = ShipMethod.STANDARD;
		}

		System.out.println("Способ доставки товара с идентификатором " + 
				productID + ": " + shipBy);
	}
}
