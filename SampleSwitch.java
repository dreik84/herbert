// Простой пример применения оператора switch
class SampleSwitch {
	public static void main(String[] args) {
		
		for (int i = 0; i < 6; i++) {
			
			switch(i) {
				case 0:
					System.out.println("i равно нулю");
					break;
				case 1:
					System.out.println("i равно одному");
					break;
			 	case 2:
					System.out.println("i равно двум");
					break;
				case 3:
				case 4:
				case 5:
				default:
					System.out.println("i больше двух");	
			}	
		}
	}
}
