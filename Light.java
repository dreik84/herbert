// Рассчитать расстояние, проходимое светом,
// с применением переменных типа long
class Light {
	public static void main(String[] args) {
		int lightSpeed;
		long days;
		long seconds;
		long distance;

		lightSpeed = 186000;
		days = 1000;
		seconds = days * 24 * 60 * 60;
		distance = lightSpeed * seconds;
		
		System.out.print("За " + days);		
		System.out.print(" дней свет пройдет около " + days);		
		System.out.println(distance + " миль.");		
	}
}
