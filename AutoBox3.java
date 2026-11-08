// Автоупакавка/автораспаковка внутри выражений

class AutoBox3 {
	public static void main(String[] args) {
		
		Integer iOb, iOb2;
		int i;

		iOb = 100;

		++iOb;

		iOb2 = iOb + (iOb / 3);

		i = iOb + (iOb / 3);

		Double dOb = 98.8;

		dOb = dOb + iOb;

		System.out.println("dOb = " + dOb);

	}	
}

