/*
 * Расчет расстояния до места вспышки молнии,
 * звук которого был услышан через 7.2 секунды
 */
class Sound {
	public static void main(String[] args) {
		double dist, time, speedOfSound;
		speedOfSound = 335.0;       // скорость звука в метрах в секунду
		time = 7.2;                 // время через которое был услышан звук
		dist = speedOfSound * time; // расстояние пройденое звуком

		System.out.println("Место вспышки молнии находится на расстоянии " + dist + " метров.");
	}
}
